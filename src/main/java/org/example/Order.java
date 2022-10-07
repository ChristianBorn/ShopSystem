package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String id;
    private List<Product> orderedProducts = new ArrayList<>();

    public Order(List<Product> orderedProducts) {
        this.id = helpers.helpers.createUUID();
        this.orderedProducts = orderedProducts;
    }

    public String getId() {
        return id;
    }
}
