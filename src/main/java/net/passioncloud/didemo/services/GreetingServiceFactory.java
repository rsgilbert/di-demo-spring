package net.passioncloud.didemo.services;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;


    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new PrimaryGreetingService();
            case "de":
                return new PrimaryGermanGreetingService();
            case "es":
                return new PrimarySpanishGreettingService();
            default:
                return new PrimarySpanishGreettingService();
        }
    }
}
