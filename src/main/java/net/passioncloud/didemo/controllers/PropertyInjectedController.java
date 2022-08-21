package net.passioncloud.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import net.passioncloud.didemo.services.GreetingService;

/**
 * In property-based dependency injection, we inject by assigning values to the public properties/fields of the class.
 */
@Controller
public class PropertyInjectedController {
    // We use auto-wired fo property injection in spring.
	@Autowired
    @Qualifier("hostileGreetingService")
    public GreetingService hostileGreetingService; // we can also use property name to determine proper bean name

    public String sayHello() {
        return hostileGreetingService.sayGreeting();
    }

}
