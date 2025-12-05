package com.example.demoRestnew.repository;

import com.example.demoRestnew.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    Payment findByOrder_OrderId(int orderId);
}
