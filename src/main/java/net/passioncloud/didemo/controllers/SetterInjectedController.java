package net.passioncloud.didemo.controllers;

import net.passioncloud.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * In setter-based dependency injection, we inject by calling setter methods of the class.
 */
@Component
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

//    @Qualifier("familyGreetingService")
    @Autowired
    public void setGreetingService(@Qualifier("familyGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
