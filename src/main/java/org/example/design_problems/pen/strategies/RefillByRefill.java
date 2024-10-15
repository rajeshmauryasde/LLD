package org.example.design_problems.pen.strategies;

public class RefillByRefill implements RefillStrategy {
    @Override
    public void refill() {
        System.out.println("Refilling by refill");
    }
}
