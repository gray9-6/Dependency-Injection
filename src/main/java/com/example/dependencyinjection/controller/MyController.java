package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.service.GreetingService;
import com.example.dependencyinjection.service.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I am in controller");
        return greetingService.sayGreeting();
    }
}
