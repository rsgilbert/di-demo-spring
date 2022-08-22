package net.passioncloud.didemo.controllers;

import net.passioncloud.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * In setter-based dependency injection, we inject by calling setter methods of the class.
 */
@Component
@Scope("prototype")
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

//    @Qualifier("familyGreetingService")
    @Autowired
    public void setGreetingService(@Qualifier("familyGreetingService") GreetingService greetingService) {
        System.out.println("setting greeting service bean");
        this.greetingService = greetingService;
    }
}
