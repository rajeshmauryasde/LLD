package org.example.basic.v3_inheritance;

public class Pigeon extends Bird {
    public Pigeon(String colour, int weight) {
        super(colour, weight);
    }

    public void fly() {
        System.out.println("Flap wings");
        System.out.println("Take off");
        System.out.println("Fly low");
    }
}
