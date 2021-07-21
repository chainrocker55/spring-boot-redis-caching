package com.example.rediscaching.repository;

import com.example.rediscaching.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}