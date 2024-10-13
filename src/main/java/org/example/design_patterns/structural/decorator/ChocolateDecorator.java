package org.example.design_patterns.structural.decorator;

public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return getCoffee().cost() + 5;
    }
}
