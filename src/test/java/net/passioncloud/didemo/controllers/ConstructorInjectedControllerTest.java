package net.passioncloud.didemo.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.passioncloud.didemo.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	ConstructorInjectedController controller;
    @BeforeEach
    public void setup() {
    	controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }
    
    @Test
    public void testGreeting() {
    	System.out.println("GREETING: " + controller.sayHello());
    	Assertions.assertEquals(controller.sayHello(), "HEY DEAR");
    }
}


