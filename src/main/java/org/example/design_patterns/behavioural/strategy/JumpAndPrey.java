package org.example.design_patterns.behavioural.strategy;

public class JumpAndPrey implements HuntingStrategy {
    @Override
    public void hunt() {
        System.out.println("Jump and prey");
    }
}
