package org.example.design_patterns.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(new JumpAndPrey());
        cat1.hunt();
        Cat cat2 = new Cat(new RunAndPrey());
        cat2.hunt();
    }
}
