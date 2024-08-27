package org.example.basic.v9_polymorphism;

public class Test {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("brown", 10);
        eagle.eat();
        eagle.fly();

        Pigeon pigeon = new Pigeon("white", 5);
        pigeon.eat();
        pigeon.fly();

        Kiwi kiwi = new Kiwi("brown", 100);
        kiwi.eat();

        Seller seller = new Seller();
        seller.sell(kiwi);

        Bird pigeon2 = new Pigeon("white", 7);
        seller.sell(pigeon2);
    }
}

/*
Having Bird type in sell method gives freedom to pass any kind of bird.

Problem with above design
 - The fields are public in Bird class which can be directly accessed and someone can change directly.

Solution
 - Make the fields private and use getter & setters

Benefit of using setter instead of directly accessing the fields
 - We can have some validation logic before setting the value of a variable.
 */