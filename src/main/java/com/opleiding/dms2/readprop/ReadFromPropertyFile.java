package com.opleiding.dms2.readprop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/property")
public class ReadFromPropertyFile {


    @Autowired
    ConfigProperties confProp;

    @GetMapping(path = "/value")//http://localhost:8082/GetProperty
    public String getPropertyValue() {
        String portNumber = confProp.getConfigValue("server.port");
        System.out.println("The value of property is :" + portNumber);
        portNumber = confProp.getConfigValue("spring.datasource.url");
        System.out.println("The datasource property is :" + portNumber);
        return portNumber;
    }

}
