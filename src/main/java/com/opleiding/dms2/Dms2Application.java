package com.opleiding.dms2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.opleiding.dms2.lombok.Account;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication

public class Dms2Application {

    public static void main(String[] args) {
 
        SpringApplication.run(Dms2Application.class, args);
    }

}
