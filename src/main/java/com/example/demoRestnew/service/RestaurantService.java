package com.example.demoRestnew.service;

import com.example.demoRestnew.model.Restaurant;
import java.util.List;

public interface RestaurantService {
    Restaurant createRestaurant(Restaurant restaurant);
    Restaurant getRestaurantById(int id);
    List<Restaurant> getAllRestaurants();
    List<Restaurant> getRestaurantsByOwner(int ownerId);
    void deleteRestaurant(int id);
}
