package com.example.demoRestnew.service;

import com.example.demoRestnew.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    User saveUser(User user);
    void deleteUser(int id);
    User findByEmail(String email);
}
