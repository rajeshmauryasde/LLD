package org.example.basic.v10_encapsulation;

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
