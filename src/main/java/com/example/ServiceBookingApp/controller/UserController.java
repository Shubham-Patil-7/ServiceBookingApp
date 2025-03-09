package com.example.ServiceBookingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ServiceBookingApp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private com.example.ServiceBookingApp.repository.UserRepository userRepository;

    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return "{\"message\": \"Email already exists!\"}";
        }
        userRepository.save(user);
        return "{\"message\": \"Signup successful!\"}";
    }
    
    @GetMapping("/")
    public String home() {
        return "Welcome to the Service Booking App!";
    }
}


