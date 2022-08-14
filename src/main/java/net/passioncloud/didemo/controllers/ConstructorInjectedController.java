package net.passioncloud.didemo.controllers;

import net.passioncloud.didemo.services.GreetingService;

/**
 * In constructor-based dependency injection, we inject by passing values as parameters in the constructor of the class.
 */
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }
}

