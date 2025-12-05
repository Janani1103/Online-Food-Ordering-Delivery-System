package com.example.demoRestnew.service;

import com.example.demoRestnew.model.Delivery;
import java.util.List;

public interface DeliveryService {
    Delivery assignDelivery(Delivery delivery);
    Delivery getDeliveryById(int id);
    List<Delivery> getDeliveriesByStaff(int staffId);
    Delivery updateDeliveryStatus(int id, String status);
}
