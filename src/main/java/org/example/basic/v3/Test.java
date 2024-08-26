package org.example.basic.v3;

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
 - Duplicate code in fly methods of Pigeon & Eagle

Solution
 - Put common code in parent class.
 */
