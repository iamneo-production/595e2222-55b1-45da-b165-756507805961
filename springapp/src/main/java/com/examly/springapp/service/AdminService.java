package com.examly.springapp.service;

import java.util.List;
import java.util.Optional;

import com.examly.springapp.model.UserModel;
import com.examly.springapp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    UserRepository userRepository;
    
    public List<UserModel> getAllUsers() {
        List<UserModel> users = userRepository.findAll();
        return users;
    }

    public List<UserModel> getOnlineUsers() {
        List<UserModel> users = userRepository.findAllByActive();
        return users;
    }

    public UserModel deleteUser(String id) {
        Optional<UserModel> user = userRepository.findByEmail(id);
        userRepository.delete(user.get());
        return user.get();
    }
}
