package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String id;
    private List<Product> orderedProducts;

    public Order(List<Product> orderedProducts) {
        this.id = helpers.helpers.createUUID();
        this.orderedProducts = orderedProducts;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "Order-ID: "+id+"\nOrdered Products: "+orderedProducts;
    }
}


