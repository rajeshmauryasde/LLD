package org.example.design_patterns.behavioural.observer;

public class EmailService implements Observer {
    @Override
    public void update() {
        System.out.println("Sending email...");
    }
}
