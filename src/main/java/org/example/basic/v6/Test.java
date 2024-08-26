package org.example.basic.v6;

public class Test {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("brown", 10);
        eagle.eat();
        eagle.fly();

        Pigeon pigeon = new Pigeon("white", 5);
        pigeon.eat();
        pigeon.fly();
    }
}

/*
Problem with above code
 - If we're going to add a new bird Kiwi which doesn't fly, we still need to implement fly() method which doesn't make any sense.

Solution
 - We can throw exception telling that Kiwi doesn't fly
 */
