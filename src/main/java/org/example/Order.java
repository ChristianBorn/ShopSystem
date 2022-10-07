package org.example;

import java.util.List;

public class Order {
    private String id;
    private List<Product> orderedProducts;

    public Order(String id, List<Product> orderedProducts) {
        this.id = id;
        this.orderedProducts = orderedProducts;
    }
}
