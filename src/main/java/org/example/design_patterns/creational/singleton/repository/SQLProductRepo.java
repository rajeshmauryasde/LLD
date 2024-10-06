package org.example.design_patterns.creational.singleton.repository;

import org.example.design_patterns.creational.singleton.product.Book;
import org.example.design_patterns.creational.singleton.product.Product;

import java.util.Objects;

public class SQLProductRepo implements ProductRepo {
    private static volatile SQLProductRepo instance;

    private SQLProductRepo() {}

    public static SQLProductRepo getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SQLProductRepo();
        }
        return instance;
    }

    @Override
    public Product getProductById(String productId) {
        return new Book("123", "Book 1", "Author 1", 10.0);
    }
}
