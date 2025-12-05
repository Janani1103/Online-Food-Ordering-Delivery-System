package com.example.demoRestnew.service;

import com.example.demoRestnew.model.Payment;
import java.util.List;

public interface PaymentService {
    Payment processPayment(Payment payment);
    Payment getPaymentById(int id);
    Payment getPaymentByOrder(int orderId);
    List<Payment> getAllPayments();
}
