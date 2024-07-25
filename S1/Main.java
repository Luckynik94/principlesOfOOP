package com.example.vending;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HotDrink tea = new HotDrink("Tea", 250, 80);
        HotDrink coffee = new HotDrink("Coffee", 200, 90);
        HotDrink hotChocolate = new HotDrink("Hot Chocolate", 300, 85);

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProducts(Arrays.asList(tea, coffee, hotChocolate));

        System.out.println(vendingMachine.getProduct("Tea"));
        System.out.println(vendingMachine.getProduct("Coffee", 200, 90));
        System.out.println(vendingMachine.getProduct("Hot Chocolate", 250, 85)); // This will be null as volume is different
    }
}