package org.example.design_problems.pen.pens;

import lombok.Getter;
import org.example.design_problems.pen.pens.pen_components.Ink;
import org.example.design_problems.pen.pens.pen_components.Nib;
import org.example.design_problems.pen.strategies.RefillByInk;

@Getter
public class Marker extends Pen {
    private final Ink ink;
    private final Nib nib;

    public Marker(String body, Ink ink, Nib nib) {
        super(body, new RefillByInk());
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void write(String text) {
        System.out.println(text);
    }

    @Override
    public void refill() {
        super.getRs().refill();
    }
}
