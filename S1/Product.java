package com.example.vending;

public abstract class Product {
    private String name;
    private int volume;

    public Product(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}