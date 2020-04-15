package com.opleiding.dms2.disimple;

import org.springframework.stereotype.Service;

@Service
public class MyService {
//We’ll take our ‘service’ and use Spring to inject it into controllers
    public String getHello(){
        return "Hello DMS Team";
    }
}