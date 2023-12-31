package com.example.dependencyinjection.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("I am in controller");
        return "Hello Everyone !!";
    }
}
