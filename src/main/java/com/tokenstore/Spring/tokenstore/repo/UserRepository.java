package com.tokenstore.Spring.tokenstore.repo;

import com.tokenstore.Spring.tokenstore.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
