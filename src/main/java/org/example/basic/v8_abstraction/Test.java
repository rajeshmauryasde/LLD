package org.example.basic.v8_abstraction;

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
    }
}