package org.example;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Kartoffeln");
        Product product2 = new Product("Äpfel");
        Product product3 = new Product("Birnen");
        ProductRepo myProducts = new ProductRepo(Map.of(
                product1.getId(), product1,
                product2.getId(), product2,
                product3.getId(), product3
        ));

        ShopSystem myShop = new ShopSystem(myProducts);
        System.out.println(List.of(
                product1.getId(),
                product2.getId(),
                product3.getId()));

        myShop.createNewOrder(List.of(
                product1.getId(),
                product2.getId(),
                product3.getId()
        ));

        System.out.println(myShop.products.toString());

    }
}