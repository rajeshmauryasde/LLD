package org.example.basic.v9_polymorphism;

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
    public String colour;
    public int weight;

    public void eat() {
        System.out.println("Eating ...");
    }
}
