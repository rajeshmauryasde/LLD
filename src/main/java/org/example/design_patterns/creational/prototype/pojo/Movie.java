package org.example.design_patterns.creational.prototype.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Movie extends Item {
    private String director;

    public Movie(String title, int price, String url, String director) {
        super(title, price, url);
        this.director = director;
    }
}
