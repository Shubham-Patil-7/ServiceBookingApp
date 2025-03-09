package com.example.ServiceBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServiceBookingApp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
