package org.example;

public class Product {
    private final String id;
    private String name;

    public Product(String name) {
        this.id = helpers.helpers.createUUID();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
