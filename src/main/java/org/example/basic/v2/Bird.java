package org.example.basic.v2;

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

    public void fly(String type) {
        if (type.equals("eagle")) {
            System.out.println("Fly high ...");
        } else if (type.equals("pigeon")) {
            System.out.println("Fly near the ground.");
        }
    }

    public static void main(String[] args) {
        Bird eagle = new Bird("Brown", 10);
        eagle.eat();
        eagle.fly("eagle");

        Bird pigeon = new Bird("White", 5);
        pigeon.eat();
        pigeon.fly("pigeon");
    }
}

/*
Let's assume that all the birds eat in the same way.
Problem with above design
 - If we are going to add a new bird Parrot, we need to add its fly behaviour as an else condition in the fly method.
 - Need to test the fly method behaviour for all the birds once again.

Solution
 - Make Bird as a parent class and make specific birds as its child.
 - Adding a new Bird will be just adding a new class. Just need to test the new class.
 */