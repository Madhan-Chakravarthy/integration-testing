package com.example.integration.testing.controller;

import com.example.integration.testing.Service.UserService;
import com.example.integration.testing.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/create")
    public User createUser(User user){
        return userService.createUser(user);
    }

}
