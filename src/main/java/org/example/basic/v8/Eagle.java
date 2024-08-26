package org.example.basic.v8;

public class Eagle extends Bird implements Flyable {
    public Eagle(String colour, int weight) {
        super(colour, weight);
    }

    @Override
    public void fly() {
        System.out.println("Fly high");
    }
}
