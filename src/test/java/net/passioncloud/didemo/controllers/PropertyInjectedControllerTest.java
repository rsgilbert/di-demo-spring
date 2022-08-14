package net.passioncloud.didemo.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.passioncloud.didemo.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setup() throws Exception {
            this.propertyInjectedController = new PropertyInjectedController();
            this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        System.out.println(this.propertyInjectedController.sayHello());
        Assertions.assertEquals(this.propertyInjectedController.sayHello(), "HEY DEAR");
    }
}
