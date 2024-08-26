package org.example.basic.v4;

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
 - If a new bird doesn't implement fly method, still it can call fly which is not fully implemented.

Solution
 - Make fly() method as abstract so that the child class is required to implement it.
 */
