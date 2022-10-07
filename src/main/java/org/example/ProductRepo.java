package org.example;

import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class ProductRepo {
    private Map<String, Product> productsInRepo = new HashMap<>();

    public ProductRepo() {}

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
    public Map<String, Product> listProducts() {
        return productsInRepo;
    }
    public void addProduct(Product product) {
        productsInRepo.put(product.getId(), product);
    }
}
