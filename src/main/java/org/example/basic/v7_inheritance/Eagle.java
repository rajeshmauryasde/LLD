package org.example.basic.v7_inheritance;

public class Eagle extends Bird {
    public Eagle(String colour, int weight) {
        super(colour, weight);
    }

    @Override
    public void fly() {
        prepareFly();
        System.out.println("Fly high");
    }
}
