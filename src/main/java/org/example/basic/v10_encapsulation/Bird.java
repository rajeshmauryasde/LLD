package org.example.basic.v10_encapsulation;

/*
Bird
-----
 - colour: String
 - weight: int

 + eat(): void
 + fly(): void
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Bird {
    private String colour;
    private int weight;

    public void eat() {
        System.out.println("Eating ...");
    }
}
