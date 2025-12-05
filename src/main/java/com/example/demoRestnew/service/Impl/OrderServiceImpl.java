
package com.example.demoRestnew.service.Impl;

import com.example.demoRestnew.model.Order;
import com.example.demoRestnew.repository.OrderRepository;
import com.example.demoRestnew.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order placeOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(int id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public List<Order> getOrdersByUser(int userId) {
        return orderRepository.findByUser_UserId(userId);
    }

    @Override
    public List<Order> getOrdersByRestaurant(int restaurantId) {
        return orderRepository.findByRestaurant_RestaurantId(restaurantId);
    }

    @Override
    public void cancelOrder(int orderId) {
        Order order = orderRepository.findById(orderId).orElse(null);
        if (order != null) {
            order.setOrderStatus("Cancelled");
            orderRepository.save(order);
        }
    }
}
