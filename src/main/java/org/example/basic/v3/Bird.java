package org.example.basic.v3;

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
}
