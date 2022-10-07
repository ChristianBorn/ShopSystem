package org.example;



import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void getProductById() {
        //GIVEN

        Product newProduct = new Product("Testproduct");
        String newId = newProduct.getId();
        ProductRepo testProductRepo = new ProductRepo(Map.of(newId, newProduct));
        //WHEN
        Product expected = newProduct;
        Product actual = testProductRepo.getProductById(newId);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    void addProduct() {
        //GIVEN
        Product newProduct = new Product("Testproduct");
        String newId = newProduct.getId();
        ProductRepo testProductRepo = new ProductRepo();
        //WHEN
        testProductRepo.addProduct(newProduct);
        Product expected = newProduct;
        Product actual = testProductRepo.getProductById(newId);
        //THEN
        assertEquals(expected, actual);
    }
}