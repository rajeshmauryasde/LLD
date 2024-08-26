package org.example.basic.v5;

public class Pigeon extends Bird {
    public Pigeon(String colour, int weight) {
        super(colour, weight);
    }

    @Override
    public void fly() {
        System.out.println("Flap wings");
        System.out.println("Take off");
        System.out.println("Fly low");
    }
}
