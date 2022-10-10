package model;

public class Product {
    private final String id;
    private final String name;

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

    public String toString() {
        return "\nProductname: "+name;
    }
}
