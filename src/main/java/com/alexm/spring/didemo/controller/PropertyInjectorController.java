package com.alexm.spring.didemo.controller;

import com.alexm.spring.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author AlexM
 */
@Controller
public class PropertyInjectorController {
    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
