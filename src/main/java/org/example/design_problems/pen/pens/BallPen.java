package org.example.design_problems.pen.pens;

import lombok.Getter;
import org.example.design_problems.pen.pens.pen_components.Refill;
import org.example.design_problems.pen.strategies.RefillByRefill;

@Getter
public class BallPen extends Pen {
    private final Refill refill;

    public BallPen(String body, Refill refill) {
        super(body, new RefillByRefill());
        this.refill = refill;
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
