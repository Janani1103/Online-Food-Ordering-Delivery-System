package com.example.demoRestnew.service.Impl;

import com.example.demoRestnew.model.Restaurant;
import com.example.demoRestnew.repository.RestaurantRepository;
import com.example.demoRestnew.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public Restaurant getRestaurantById(int id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public List<Restaurant> getRestaurantsByOwner(int ownerId) {
        return restaurantRepository.findByOwner_UserId(ownerId);
    }

    @Override
    public void deleteRestaurant(int id) {
        restaurantRepository.deleteById(id);
    }
}
