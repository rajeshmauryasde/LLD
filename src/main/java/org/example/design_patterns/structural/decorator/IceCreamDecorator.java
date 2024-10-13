package org.example.design_patterns.structural.decorator;

public class IceCreamDecorator extends CoffeeDecorator {
    public IceCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return getCoffee().cost() + 10;
    }
}
