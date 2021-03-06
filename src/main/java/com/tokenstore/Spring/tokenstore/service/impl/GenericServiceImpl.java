package com.tokenstore.Spring.tokenstore.service.impl;

import com.tokenstore.Spring.tokenstore.entites.RandomCity;
import com.tokenstore.Spring.tokenstore.entites.User;
import com.tokenstore.Spring.tokenstore.repo.RandomCityRepository;
import com.tokenstore.Spring.tokenstore.repo.UserRepository;
import com.tokenstore.Spring.tokenstore.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return randomCityRepository.findAll();
    }
}
