package org.example.design_patterns.creational.singleton.repository;

import org.example.design_patterns.creational.singleton.product.Product;

public interface ProductRepo {
    Product getProductById(String productId);
}
