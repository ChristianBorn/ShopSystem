package org.example;

import java.util.Map;

public class OrderRepo {
    Map<String, Order> ordersInRepo;

    public OrderRepo (Map<String, Order> ordersInRepo) {
        this.ordersInRepo = ordersInRepo;
    }
}
