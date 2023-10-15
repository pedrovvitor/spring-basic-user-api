package com.pedrolima.springbasicuserapi.repositories;

import com.pedrolima.springbasicuserapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
