package org.example;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void getProductById() {
        //GIVEN
        String newId = helpers.helpers.createUUID();
        Product newProduct = new Product(newId, "Testproduct");
        ProductRepo testProductRepo = new ProductRepo(Map.of(newId, newProduct));
        //WHEN
        Product expected = newProduct;
        Product actual = testProductRepo.getProductById(newId);
        //THEN
        assertEquals(expected, actual);
    }
}