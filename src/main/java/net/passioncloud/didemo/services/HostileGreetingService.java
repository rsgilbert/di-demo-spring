package net.passioncloud.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class HostileGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "You are not welcome here. Go away!";
    }
}
