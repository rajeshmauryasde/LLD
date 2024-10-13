package org.example.design_patterns.structural.decorator;

import lombok.Getter;

@Getter
public abstract class CoffeeDecorator extends Coffee {
    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
