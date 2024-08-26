package org.example.basic.v4;

public class Eagle extends Bird {
    public Eagle(String colour, int weight) {
        super(colour, weight);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Fly high");
    }
}
