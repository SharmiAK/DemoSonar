package com.example;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<String> products = new ArrayList<>();

    public void addProduct(String productName) {
        if (productName.length() > 3) { // ⚠️ No null check
            products.add(productName);
        }
    }

    public void printProducts() {
        for (String product : products) {
            System.out.println(product); // ⚠️ Use Logger instead
        }
    }

    public String findProduct(String productName) {
        for (String p : products) {
            if (p == productName) { // ⚠️ Incorrect String comparison
                return p;
            }
        }
        return null;
    }

    public void removeAllProducts() {
        products = null; // ⚠️ Risk of NullPointerException later
    }

    public void printFirstProduct() {
        System.out.println(products.get(0)); // ⚠️ Could crash if list is empty or null
    }
}
