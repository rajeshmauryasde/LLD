package org.example.solid.di.payment;

import org.example.solid.di.product.Product;
import org.example.solid.di.repository.ProductRepo;
import org.example.solid.di.repository.SQLProductRepo;

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
