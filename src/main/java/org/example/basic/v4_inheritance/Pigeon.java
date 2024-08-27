package org.example.basic.v4_inheritance;

public class Pigeon extends Bird {
    public Pigeon(String colour, int weight) {
        super(colour, weight);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Fly low");
    }
}
