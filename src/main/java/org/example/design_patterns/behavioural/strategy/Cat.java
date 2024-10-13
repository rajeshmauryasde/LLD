package org.example.design_patterns.behavioural.strategy;

public class Cat {
    private final HuntingStrategy huntingStrategy;

    public Cat(HuntingStrategy huntingStrategy) {
        this.huntingStrategy = huntingStrategy;
    }

    public void hunt() {
        huntingStrategy.hunt();
    }
}
