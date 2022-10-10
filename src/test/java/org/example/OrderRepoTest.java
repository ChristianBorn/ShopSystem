package org.example;

import model.Order;
import model.Product;
import org.junit.jupiter.api.Test;
import repo.OrderRepo;

import java.util.List;
import java.util.Map;


import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void addOrder() {
        //GIVEN
        Product newProduct = new Product("testproduct");
        Order newOrder = new Order(List.of(newProduct));

        OrderRepo testOrderRepo = new OrderRepo();
        //WHEN
        testOrderRepo.addOrder(newOrder);
        Order actual = testOrderRepo.getOrderById(newOrder.getId());
        //THEN
        Order expected = newOrder;

        assertEquals(expected, actual);
    }

    @Test
    void getOrderById() {
        //GIVEN
        Product newProduct = new Product("testproduct");
        Order newOrder = new Order(List.of(newProduct));
        OrderRepo testOrderRepo = new OrderRepo(Map.of(newOrder.getId(), newOrder));
        //WHEN
        Order actual = testOrderRepo.getOrderById(newOrder.getId());
        //THEN
        Order expected = newOrder;

        assertEquals(expected, actual);
    }

    @Test
    void listOrders() {
        //GIVEN
        Product newProduct1 = new Product("testproduct");
        Product newProduct2 = new Product("testproduct");
        Order newOrder1 = new Order(List.of(newProduct1));
        Order newOrder2 = new Order(List.of(newProduct2));
        OrderRepo orderRepoTest = new OrderRepo();
        orderRepoTest.addOrder(newOrder1);
        orderRepoTest.addOrder(newOrder2);
        //WHEN
        Map<String, Order> expected = Map.of(
                newOrder1.getId(), newOrder1,
                newOrder2.getId(), newOrder2
        );
        Map<String, Order> actual = orderRepoTest.listOrders();
        //THEN
        assertEquals(expected, actual);
    }
}