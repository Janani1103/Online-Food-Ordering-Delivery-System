package com.example.demoRestnew.repository;

import com.example.demoRestnew.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
    List<Delivery> findByDeliveryStaff_UserId(int userId);
}
