package com.tokenstore.Spring.tokenstore.repo;

import com.tokenstore.Spring.tokenstore.entites.RandomCity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RandomCityRepository extends JpaRepository<RandomCity, Long> {
}
