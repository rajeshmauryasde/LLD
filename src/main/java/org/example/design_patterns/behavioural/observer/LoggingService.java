package org.example.design_patterns.behavioural.observer;

public class LoggingService implements Observer{
    @Override
    public void update() {
        System.out.println("Writing log...");
    }
}
