package org.example.design_patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee latte = new Latte();
        System.out.println("Latte: " + latte.cost());

        Coffee cappuccino = new Cappuccino();
        System.out.println("Cappuccino: " + cappuccino.cost());

        Coffee latteWithChocolate = new ChocolateDecorator(latte);
        System.out.println("Latte with chocolate: " + latteWithChocolate.cost());

        Coffee cappuccinoWithIceCream = new IceCreamDecorator(cappuccino);
        System.out.println("Cappuccino with Ice cream: " + cappuccinoWithIceCream.cost());

        Coffee latteWithChocolateAndIceCream = new IceCreamDecorator(latteWithChocolate);
        System.out.println("Latte with chocolate and ice cream: " + latteWithChocolateAndIceCream.cost());
    }
}
