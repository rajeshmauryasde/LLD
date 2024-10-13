package org.example.design_patterns.behavioural.observer;


import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    private final List<Observer> observers;

    public PrimeNumber() {
        observers = new ArrayList<>();
    }

    public void process(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (isPrime(number)) {
                notifyObservers();
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
}
