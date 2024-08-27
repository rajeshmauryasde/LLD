package org.example.basic.v10_encapsulation;

public class Seller {
    public void sell(Bird bird) {
        if (bird.getColour().equals("brown")) {
            System.out.println("Sell for $50");
        }
        else if (bird.getColour().equals("white")) {
            System.out.println("Sell for $100");
        }
        else {
            System.out.println("Can't be sold");
        }
    }
}
