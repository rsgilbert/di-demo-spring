package net.passioncloud.didemo.controllers;

import net.passioncloud.didemo.services.GreetingService; 

/**
 * In property-based dependency injection, we inject by assigning values to the public properties/fields of the class.
 */
public class PropertyInjectedController {
    public GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
