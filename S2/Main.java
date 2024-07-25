package com.example.market;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Human john = new Human("John");
        Human alice = new Human("Alice");
        Human bob = new Human("Bob");

        market.acceptToMarket(john);
        market.acceptToMarket(alice);
        market.acceptToMarket(bob);

        market.update();

        market.releaseFromMarket(john);

        market.update();
    }
}