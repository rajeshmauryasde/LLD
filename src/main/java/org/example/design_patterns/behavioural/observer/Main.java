package org.example.design_patterns.behavioural.observer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.subscribe(new EmailService());
        primeNumber.subscribe(new LoggingService());

        primeNumber.process(Arrays.asList(2, 5, 6, 8, 10, 252, 253));
    }
}
