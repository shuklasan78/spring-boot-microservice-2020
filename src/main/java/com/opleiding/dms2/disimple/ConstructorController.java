package com.opleiding.dms2.disimple;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstructorController {
    private MyService myService;
    // There are two main concerns right now. One, the type of our service is a concrete type. Dependency injection of a hard type is not considered a best practice.
    public ConstructorController(MyService myService) {
        this.myService = myService;
    }
    @RequestMapping("di/constructor")
    public String saySomething(){
        return myService.getHello();
    }
    
}