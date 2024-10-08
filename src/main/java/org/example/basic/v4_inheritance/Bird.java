package org.example.basic.v4_inheritance;

/*
Bird
-----
 - colour: String
 - weight: int

 + eat(): void
 + fly(): void
 */

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bird {
    private String colour;
    private int weight;

    public void eat() {
        System.out.println("Eating ...");
    }

    public void fly() {
        System.out.println("Flap wings");
        System.out.println("Take off");
    }
}
