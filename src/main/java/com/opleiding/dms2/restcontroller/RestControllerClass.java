package com.opleiding.dms2.restcontroller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


enum ServiceStatus {

    LOGIN_SUCCESS(10, "Login Is success");

    private final int id;
    private final String message;

    //Enum constructor
    ServiceStatus(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }


}

@RestController
@RequestMapping("/restcontroller")
public class RestControllerClass {


    public String getName() {
        return "This is simple rest message from Rest Controller";
    }

    @RequestMapping("/restcontroller/name")        //http://localhost:8081/name?name=sandeep
    public String getNames(@RequestParam String name) {
        String display = "The parameter name is " + name;
        return display;   // give exception trace when no parameter is provided
    }

    @GetMapping(path = "/credential")  //http://localhost:8082/user/names
    public ResponseEntity<ServiceStatus> restApiExample(HttpServletRequest request,
                                                        HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username  :" + username + "  password   :" + password);
        //loginService.login(username, password, request);
        return new ResponseEntity<ServiceStatus>(ServiceStatus.LOGIN_SUCCESS,
                HttpStatus.ACCEPTED);
    }


    //This is other way to call the API
    @GetMapping("/restcontroller/params")
    public String getParams(@RequestParam Map<String, String> allParams) {
        return "Parameters are " + allParams.entrySet();
    }

    //As you are using Spring Boot web, Jackson dependency is implicit and we do not have to define explicitly.
    //you can check for Jackson dependency in your pom.xml in the dependency hierarchy tab if using eclipse.
    //And as you have annotated with @RestController there is no need to do explicit json conversion.
    //Just return a POJO and jackson serializer will take care of converting to json. It is equivalent to using @ResponseBody
    //when used with @Controller. Rather than placing @ResponseBody on every controller method we place @RestController
    // instead of vanilla @Controller and @ResponseBody by default is applied on all resources in that controller.
    @GetMapping("/restcontroller/mapvalue")  //http://localhost:8082/restcontroller/mapvalues
    public Map<String, String> getNames() {
        Map<String, String> o1 = new HashMap<String, String>();
        o1.put("Sandee", "40");
        o1.put("Veena", "35");
        o1.put("Jos", "50");
        o1.put("Bert", "55");
        o1.put("Dennis", "48");

        return o1;
    }

}
    