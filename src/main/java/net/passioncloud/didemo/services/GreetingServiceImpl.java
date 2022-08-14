package net.passioncloud.didemo.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GreetingServiceImpl implements GreetingService {
    String GREETING = "HEY DEAR";
    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
