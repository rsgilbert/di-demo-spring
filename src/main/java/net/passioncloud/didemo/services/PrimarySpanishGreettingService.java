package net.passioncloud.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimarySpanishGreettingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}
