package com.example.demoRestnew.service;

import com.example.demoRestnew.model.Order;
import java.util.List;

public interface OrderService {
    Order placeOrder(Order order);
    Order getOrderById(int id);
    List<Order> getOrdersByUser(int userId);
    List<Order> getOrdersByRestaurant(int restaurantId);
    void cancelOrder(int orderId);
}
