package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.service.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
