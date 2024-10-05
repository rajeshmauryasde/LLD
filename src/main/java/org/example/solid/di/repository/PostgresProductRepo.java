package org.example.solid.di.repository;

import org.example.solid.di.product.Book;
import org.example.solid.di.product.Product;

public class PostgresProductRepo implements ProductRepo{
    @Override
    public Product getProductById(String productId) {
        return new Book("123", "Book 1", "Author 1", 10.0);
    }
}
