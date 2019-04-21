package com.alexm.spring.didemo.controller;

import com.alexm.spring.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author AlexM
 */
public class ConstructorInjectorControllerTest {

    private ConstructorInjectorController constructorInjectorController;

    @Before
    public void setup() {
        this.constructorInjectorController = new ConstructorInjectorController(new GreetingServiceImpl());
    }


    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectorController.sayHello());
    }
}
