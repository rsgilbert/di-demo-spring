package net.passioncloud.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import net.passioncloud.didemo.services.GreetingService; 

/**
 * In property-based dependency injection, we inject by assigning values to the public properties/fields of the class.
 */
@Controller
public class PropertyInjectedController {
    // We use auto-wired fo property injection in spring.
	@Autowired
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
