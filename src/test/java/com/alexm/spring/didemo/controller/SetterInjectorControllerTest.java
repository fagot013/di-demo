package com.alexm.spring.didemo.controller;

import com.alexm.spring.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author AlexM
 */
public class SetterInjectorControllerTest {
    private SetterInjectorController setterInjectorController;

    @Before
    public void setup() {
        setterInjectorController = new SetterInjectorController();
        setterInjectorController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectorController.sayHello());
    }
}
