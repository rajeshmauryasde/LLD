package org.example.basic.v9_polymorphism;

public class Seller {
    public void sell(Bird bird) {
        if (bird.colour.equals("brown")) {
            System.out.println("Sell for $50");
        }
        else if (bird.colour.equals("white")) {
            System.out.println("Sell for $100");
        }
        else {
            System.out.println("Can't be sold");
        }
    }
}
