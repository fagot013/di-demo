package com.alexm.spring.didemo.controller;

import org.springframework.stereotype.Controller;

/**
 * @author AlexM
 */
@Controller
public class MyController {
    public String hello() {
        System.out.println("Hello!!!!");
        return "dummy";
    }
}
