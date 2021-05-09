package com.tokenstore.Spring.tokenstore.repo;

import com.tokenstore.Spring.tokenstore.entites.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
