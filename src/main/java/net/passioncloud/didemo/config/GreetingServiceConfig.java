package net.passioncloud.didemo.config;

import net.passioncloud.didemo.services.GreetingRepository;
import net.passioncloud.didemo.services.GreetingService;
import net.passioncloud.didemo.services.GreetingServiceFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

@Configuration
public class GreetingServiceConfig {


    @Bean
//    @Scope("prototype")
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
        System.out.println("I am a bean that creates the factory");
        return new GreetingServiceFactory(greetingRepository);
    }

    @Primary
    @Profile("de")
    @Bean
    public GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("de");
    }


    @Primary
    @Profile({"es","default"})
    @Bean
    @Scope("prototype")
    public GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        System.out.println("I am the default greeting");
        return greetingServiceFactory.createGreetingService("es");
    }

    @Primary
    @Profile("en")
    @Bean
    public GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");
    }




}
