package org.example.design_problems.pen.strategies;

public class RefillByInk implements RefillStrategy {
    @Override
    public void refill() {
        System.out.println("Refill by ink");
    }
}
