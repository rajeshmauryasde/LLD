package org.example.design_patterns.creational.singleton.payment;

import org.example.design_patterns.creational.singleton.product.Product;
import org.example.design_patterns.creational.singleton.repository.ProductRepo;

public class PaymentProcessor {
    private final ProductRepo productRepo;
    public PaymentProcessor(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public void processPayment(String productId) {
        Product product = productRepo.getProductById(productId);
        System.out.println("Processing payment\nProduct name: " + product.getName() + "\nPrice: " + product.getPrice());
    }
}
