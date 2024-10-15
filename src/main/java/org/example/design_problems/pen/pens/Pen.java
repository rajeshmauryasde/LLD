package org.example.design_problems.pen.pens;

import lombok.Getter;
import org.example.design_problems.pen.Writable;
import org.example.design_problems.pen.strategies.RefillStrategy;

@Getter
public abstract class Pen implements Writable {
    private final String body;
    private final RefillStrategy rs;

    public Pen(String body, RefillStrategy rs) {
        this.body = body;
        this.rs = rs;
    }

    public abstract void refill();
}
