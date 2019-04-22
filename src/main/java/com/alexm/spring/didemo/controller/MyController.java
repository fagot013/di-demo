package com.alexm.spring.didemo.controller;

import com.alexm.spring.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author AlexM
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!!!");
        return greetingService.sayGreeting();
    }
}
