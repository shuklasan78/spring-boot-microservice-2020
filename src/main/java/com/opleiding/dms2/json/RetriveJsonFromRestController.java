package com.opleiding.dms2.json;

import java.io.BufferedReader;
//https://www.journaldev.com/2324/jackson-json-java-parser-api-example-tutorial
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("json")
public class RetriveJsonFromRestController {


    @GetMapping(value = "names")  //http://localhost:8082/user/names
    public Map<String, String> getNames() {
        Map<String, String> o1 = new HashMap<String, String>();
        o1.put("Sandee", "40");
        o1.put("Veena", "35");
        o1.put("Jos", "50");
        o1.put("Bert", "55");
        o1.put("Dennis", "42");

        return o1;
    }

    // json data can return the object directly
    @GetMapping(path = "/loadJsonFile")  //http://localhost:8082/user/names
    public Employee loadJSONFile(HttpServletRequest request,
                                 HttpServletResponse response) throws IOException {

        try (InputStream inputStream = getClass().getResourceAsStream("/employee.json");
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String contents = reader.lines().collect(Collectors.joining(System.lineSeparator()));
            System.out.println("Content Found : " + contents);
            byte[] jsonData = contents.getBytes();
            //create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            //convert json string to object
            Employee emp = objectMapper.readValue(jsonData, Employee.class);

            System.out.println("Employee Object\n" + emp);

            return emp;
        }


    }


}
    
