package net.passioncloud.didemo.controllers;

import net.passioncloud.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * In constructor-based dependency injection, we inject by passing values as parameters in the constructor of the class.
 */
@Component
public class ConstructorInjectedController {
    private GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController(@Qualifier("hostileGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

