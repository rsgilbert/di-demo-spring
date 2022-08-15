package net.passioncloud.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("en")
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Good morning, I am the primary greeting";
    }
}
