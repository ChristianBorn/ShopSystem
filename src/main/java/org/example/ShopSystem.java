package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShopSystem {
    private ProductRepo products = new ProductRepo();
    private OrderRepo orders = new OrderRepo();

    public ShopSystem() {}
    public ShopSystem(ProductRepo products) {
        this.products = products;
    }
    public ShopSystem(OrderRepo orders) {
        this.orders = orders;
    }
    public ShopSystem(ProductRepo products, OrderRepo orders) {
        this.products = products;
        this.orders = orders;
    }
    public void createNewOrder(List<String> productIdsToOrder) {
        List<Product> productsToOrder = new ArrayList<>();
        for (String id : productIdsToOrder) {
            try {
                productsToOrder.add(products.getProductById(id));
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        Order newOrder = new Order(productsToOrder);
        orders.addOrder(newOrder);
    }
    public Order getSpecificOrder(String id) {
        return orders.getOrderById(id);
    }
    public Map<String, Order> getAllOrders() {
        return orders.listOrders();
    }

}
