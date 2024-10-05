package org.example.solid.di.repository;

import org.example.solid.di.product.Product;

public interface ProductRepo {
    Product getProductById(String productId);
}
