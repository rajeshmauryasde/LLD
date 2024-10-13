package org.example.design_patterns.structural.flying_weight;

import lombok.Getter;

@Getter
public class Bullet {
    private final String image;

    public Bullet(String image) {
        this.image = image;
    }
}
