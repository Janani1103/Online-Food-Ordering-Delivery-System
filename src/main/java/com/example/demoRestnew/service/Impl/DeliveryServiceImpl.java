package com.example.demoRestnew.service.Impl;

import com.example.demoRestnew.model.Delivery;
import com.example.demoRestnew.repository.DeliveryRepository;
import com.example.demoRestnew.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeliveryServiceImpl implements DeliveryService {
    @Autowired
    private DeliveryRepository deliveryRepository;

    @Override
    public Delivery assignDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public Delivery getDeliveryById(int id) {
        return deliveryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Delivery> getDeliveriesByStaff(int staffId) {
        return deliveryRepository.findByDeliveryStaff_UserId(staffId);
    }

    @Override
    public Delivery updateDeliveryStatus(int id, String status) {
        Delivery delivery = deliveryRepository.findById(id).orElse(null);
        if (delivery != null) {
            delivery.setStatus(status);
            return deliveryRepository.save(delivery);
        }
        return null;
    }
}
