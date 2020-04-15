package com.opleiding.dms2.disimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FieldController {

    @Autowired
    private MyService myService;  //keep always private
//We can improve upon this by providing a setter for the private property. Getters and setters are generally considered best practices in object oriented programming
    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }
    @GetMapping("di/method")
    public String saySomething(){
        return myService.getHello();
    }
}