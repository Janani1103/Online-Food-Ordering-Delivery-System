package com.example.demoRestnew.repository;

import com.example.demoRestnew.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
    List<Restaurant> findByOwner_UserId(int ownerId);
}