package org.example.design_patterns.creational.prototype.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Book extends Item {
    private String author;

    public Book(String title, int price, String url, String author) {
        super(title, price, url);
        this.author = author;
    }

}
