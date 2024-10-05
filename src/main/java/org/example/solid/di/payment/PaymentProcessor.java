package org.example.solid.di.payment;

import org.example.solid.di.product.Product;
import org.example.solid.di.repository.SQLProductRepository;

public class PaymentProcessor {
    public void processPayment(String productId) {
        SQLProductRepository sqlProductRepository = new SQLProductRepository();
        Product product = sqlProductRepository.getProductById(productId);
        System.out.println("Processing payment\nProduct name: " + product.getName() + "\nPrice: " + product.getPrice());
    }
}
