package org.example;

import java.util.Map;

public class ProductRepo {
    private Map<String, Product> productsInRepo;

    public ProductRepo(Map<String, Product> productsInRepo) {
        this.productsInRepo = productsInRepo;
    }
}
