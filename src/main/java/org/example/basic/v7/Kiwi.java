package org.example.basic.v7;

import org.example.basic.v7.Bird;

public class Kiwi extends Bird {
    public Kiwi(String colour, int weight) {
        super(colour, weight);
    }

    @Override
    public void fly() throws CannotFlyException {
        throw new CannotFlyException("Kiwi doesn't fly");
    }
}
