package com.example.integration.testing.Service;

import com.example.integration.testing.entity.User;
import com.example.integration.testing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User findById(Integer id){
        return userRepository.findById(id).get();
    }
    public List<User> findAll(Integer id){
        return userRepository.findAll();
    }
}
