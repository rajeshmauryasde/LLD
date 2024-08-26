package org.example.basic.v5;

public class Eagle extends Bird {
    public Eagle(String colour, int weight) {
        super(colour, weight);
    }

    @Override
    public void fly() {
        System.out.println("Flap wings");
        System.out.println("Take off");
        System.out.println("Fly high");
    }
}
