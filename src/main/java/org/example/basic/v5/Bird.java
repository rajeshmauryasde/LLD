package org.example.basic.v5;

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

    public abstract void fly();
}
