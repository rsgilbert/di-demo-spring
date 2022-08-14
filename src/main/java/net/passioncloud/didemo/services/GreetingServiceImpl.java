package net.passioncloud.didemo.services;

public class GreetingServiceImpl implements GreetingService {
    String GREETING = "HEY DEAR";
    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
