package org.example.basic.v7_inheritance;

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
        // Can't call below
        // kiwi.fly();
    }
}

/*
Problem with above design
 - It is not practical to throw an exception. If a client is using our code, and he gets an exception for calling, the method is not good.
 - Also we should not force a subclass to implement a behaviour which he doesn't perform.
 - There are objects other than birds that also fly. e.g. Kite, Airplane, Rocket

Solution
 - Instead of keeping fly() behaviour in Bird, we create an interface which will have a fly() method. Whichever bird performs fly behaviour can implement this interface.

 */
