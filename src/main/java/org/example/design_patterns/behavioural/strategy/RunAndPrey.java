package org.example.design_patterns.behavioural.strategy;

public class RunAndPrey implements HuntingStrategy {
    @Override
    public void hunt() {
        System.out.println("Run and Prey");
    }
}
