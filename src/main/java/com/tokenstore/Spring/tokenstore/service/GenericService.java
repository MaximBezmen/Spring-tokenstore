package com.tokenstore.Spring.tokenstore.service;

import com.tokenstore.Spring.tokenstore.entites.RandomCity;
import com.tokenstore.Spring.tokenstore.entites.User;

import java.util.List;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
