package com.example.vending;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrink> products = new ArrayList<>();

    @Override
    public void initProducts(List<Product> products) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                this.products.add((HotDrink) product);
            }
        }
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrink product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (HotDrink product : products) {
            if (product.getName().equals(name) &&
                    product.getVolume() == volume &&
                    product.getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
}