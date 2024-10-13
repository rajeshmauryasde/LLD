package org.example.design_patterns.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(new JumpAndPrey());
        cat.hunt();
        Cat leopard = new Cat(new RunAndPrey());
        leopard.hunt();
    }
}
