package com.alexm.spring.didemo.controller;

import com.alexm.spring.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author AlexM
 */
public class PropertyInjectorControllerTest {

    private PropertyInjectorController propertyInjectorController;

    @Before
    public void setup() {
        propertyInjectorController =new PropertyInjectorController();
        propertyInjectorController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectorController.sayHello());
    }
}
