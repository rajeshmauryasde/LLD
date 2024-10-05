package org.example.solid.di;

import org.example.solid.di.payment.PaymentProcessor;
import org.example.solid.di.product.Book;
import org.example.solid.di.product.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Book("123", "Book 1", "Author 1", 10.0);
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(product.getProductId());
    }
}
