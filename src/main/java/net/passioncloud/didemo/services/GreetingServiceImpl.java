package net.passioncloud.didemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("en")
@Component
public class GreetingServiceImpl implements GreetingService {
    String GREETING = "HEY DEAR";
    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
