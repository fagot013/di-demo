package com.alexm.spring.didemo.controller;

import com.alexm.spring.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author AlexM
 */
@Controller
public class ConstructorInjectorController {
    private final GreetingService greetingService;

    public ConstructorInjectorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
