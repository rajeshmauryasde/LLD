package org.example.design_patterns.structural.flying_weight;

import lombok.Getter;
import lombok.Setter;

@Getter
public class MovingBullet {
    private final Bullet bullet;
    @Setter
    private int x;
    @Setter
    private int y;
    @Setter
    private int z;
    @Setter
    private int speed;

    public MovingBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
