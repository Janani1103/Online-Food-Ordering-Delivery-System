package com.example.demoRestnew.controller;

import com.example.demoRestnew.model.Delivery;
import com.example.demoRestnew.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deliveries")
public class DeliveryController {
    @Autowired
    private DeliveryService deliveryService;

    @PostMapping
    public ResponseEntity<Delivery> assignDelivery(@RequestBody Delivery delivery) {
        Delivery assignedDelivery = deliveryService.assignDelivery(delivery);
        return new ResponseEntity<>(assignedDelivery, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Delivery> getDeliveryById(@PathVariable int id) {
        Delivery delivery = deliveryService.getDeliveryById(id);
        return ResponseEntity.ok(delivery);
    }

    @GetMapping("/staff/{staffId}")
    public List<Delivery> getDeliveriesByStaff(@PathVariable int staffId) {
        return deliveryService.getDeliveriesByStaff(staffId);
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<Delivery> updateDeliveryStatus(
            @PathVariable int id,
            @RequestParam String status
    ) {
        Delivery updatedDelivery = deliveryService.updateDeliveryStatus(id, status);
        return ResponseEntity.ok(updatedDelivery);
    }
}