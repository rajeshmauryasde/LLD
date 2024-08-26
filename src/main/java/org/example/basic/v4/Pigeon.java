package org.example.basic.v4;

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
