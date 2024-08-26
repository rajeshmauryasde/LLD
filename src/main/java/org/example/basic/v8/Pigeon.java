package org.example.basic.v8;

public class Pigeon extends Bird implements Flyable {
    public Pigeon(String colour, int weight) {
        super(colour, weight);
    }

    @Override
    public void fly() {
        System.out.println("Fly low");
    }
}
