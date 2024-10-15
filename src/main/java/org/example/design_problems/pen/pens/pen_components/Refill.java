package org.example.design_problems.pen.pens.pen_components;

import lombok.Getter;

@Getter
public class Refill {
    private final Ink ink;
    private final Nib nib;

    public Refill(Ink ink, Nib nib) {
        this.ink = ink;
        this.nib = nib;
    }
}
