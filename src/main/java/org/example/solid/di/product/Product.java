package org.example.solid.di.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public abstract class Product {
    private final String productId;
    private final String name;
    @Setter
    private double price;
}
