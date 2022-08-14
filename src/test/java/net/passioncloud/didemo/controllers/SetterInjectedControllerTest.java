package net.passioncloud.didemo.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.passioncloud.didemo.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
    private SetterInjectedController controller;
    @BeforeEach
    public void setup() {
        this.controller = new SetterInjectedController();
        this.controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        System.out.println(this.controller.sayHello());
        Assertions.assertEquals(this.controller.sayHello(), "HEY DEAR");
    }
}
