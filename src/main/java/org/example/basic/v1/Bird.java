package org.example.basic.v1;

import lombok.AllArgsConstructor;

/*
Bird
-----
 - colour: String
 - weight: int

 + eat(): void
 + fly(): void

 */

@AllArgsConstructor
public class Bird {
    private String colour;
    private int weight;

    public void eat() {
        System.out.println("Eating ...");
    }

    public void fly() {
        System.out.println("Flap flap ...");
    }

    public static void main(String[] args) {
        Bird eagle = new Bird("Brown", 10);
        eagle.eat();
        eagle.fly();

        Bird pigeon = new Bird("White", 5);
        pigeon.eat();
        pigeon.fly();
    }
}

/*
Let's assume that all the birds eat in the same way.
Problem with above design
 - Eagle and pigeon fly in the same way.

Solution
 - Pass type of bird in fly method and define its behaviour based on the type.
 */