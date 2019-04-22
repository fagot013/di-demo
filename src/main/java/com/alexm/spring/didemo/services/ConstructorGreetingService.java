package com.alexm.spring.didemo.services;

import org.springframework.stereotype.Service;

/**
 * @author AlexM
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hello - I was called from ConstructorGreetingService";
    }
}
