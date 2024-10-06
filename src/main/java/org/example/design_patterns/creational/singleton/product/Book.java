package org.example.design_patterns.creational.singleton.product;

import lombok.Getter;

@Getter
public class Book extends Product {
    private final String author;

    public Book(String productId, String name, String author, double price) {
        super(productId, name, price);
        this.author = author;
    }
}
