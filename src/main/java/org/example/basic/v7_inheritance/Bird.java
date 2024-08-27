package org.example.basic.v7_inheritance;

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
public abstract class Bird {
    private String colour;
    private int weight;

    public void eat() {
        System.out.println("Eating ...");
    }

    public void prepareFly() {
        System.out.println("Flap wings");
        System.out.println("Take off");
    }

    public abstract void fly() throws CannotFlyException;
}
