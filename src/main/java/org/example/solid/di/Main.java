package org.example.solid.di;

import org.example.solid.di.payment.PaymentProcessor;
import org.example.solid.di.product.Book;
import org.example.solid.di.product.Product;
import org.example.solid.di.repository.ProductRepo;
import org.example.solid.di.repository.SQLProductRepo;

public class Main {
    public static void main(String[] args) {
        Product product = new Book("123", "Book 1", "Author 1", 10.0);
        ProductRepo productRepo = new SQLProductRepo();
        PaymentProcessor paymentProcessor = new PaymentProcessor(productRepo);
        paymentProcessor.processPayment(product.getProductId());
    }
}
