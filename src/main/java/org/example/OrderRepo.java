package org.example;

import java.util.HashMap;
import java.util.Map;

public class OrderRepo {
    Map<String, Order> ordersInRepo = new HashMap<>();

    public OrderRepo () {}
    public OrderRepo (Map<String, Order> ordersInRepo) {
        this.ordersInRepo = ordersInRepo;
    }

    public void addOrder(Order orderToAdd) {
        ordersInRepo.put(orderToAdd.getId(), orderToAdd);
    }

    public Order getOrderById(String id) {
        if (ordersInRepo.containsKey(id)) {
            return ordersInRepo.get(id);
        }
        else {
            throw new IllegalArgumentException("No product found for given ID");
        }
    }

    public Map<String, Order> listOrders() {
        return ordersInRepo;
    }
}
