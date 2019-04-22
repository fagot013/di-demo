package com.alexm.spring.didemo.services;

import org.springframework.stereotype.Service;

/**
 * @author AlexM
 */
@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was called from SetterGreetingService";
    }
}
