package org.example.design_patterns.creational.singleton;

import org.example.design_patterns.creational.singleton.payment.PaymentProcessor;
import org.example.design_patterns.creational.singleton.product.Book;
import org.example.design_patterns.creational.singleton.product.Product;
import org.example.design_patterns.creational.singleton.repository.ProductRepo;
import org.example.design_patterns.creational.singleton.repository.SQLProductRepo;

public class Main {
    public static void main(String[] args) {
        Product product = new Book("123", "Book 1", "Author 1", 10.0);
        ProductRepo productRepo = SQLProductRepo.getInstance();
        PaymentProcessor paymentProcessor = new PaymentProcessor(productRepo);
        paymentProcessor.processPayment(product.getProductId());
    }
}
