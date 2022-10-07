package org.example;

import java.util.Map;

public class ProductRepo {
    private Map<String, Product> productsInRepo;

    public ProductRepo(Map<String, Product> productsInRepo) {
        this.productsInRepo = productsInRepo;
    }

    public Product getProductById(String id) {
        if (productsInRepo.containsKey(id)) {
            return productsInRepo.get(id);
        }
        else {
            throw new IllegalArgumentException("No product found for given ID");
        }
    }
}
