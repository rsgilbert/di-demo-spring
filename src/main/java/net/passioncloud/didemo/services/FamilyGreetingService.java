package net.passioncloud.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class FamilyGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Welcome back home!";
    }
}
