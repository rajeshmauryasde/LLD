package org.example.basic.v7_inheritance;

public class Pigeon extends Bird {
    public Pigeon(String colour, int weight) {
        super(colour, weight);
    }

    @Override
    public void fly() {
        prepareFly();
        System.out.println("Fly low");
    }
}
