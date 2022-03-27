package com.examly.springapp.controller;

import java.util.List;

import com.examly.springapp.model.UserModel;
import com.examly.springapp.service.AdminService;
import com.examly.springapp.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class UserController {
    @Autowired
    AdminService adminService;

    @Autowired
    AuthService authService;

    @GetMapping("")
    public List<UserModel> getUser() {
        List<UserModel> users = adminService.getAllUsers();
        return users;
    }

    @PostMapping("/online")
    public List<UserModel> getOnlineUser() {
        List<UserModel> users = adminService.getOnlineUsers();
        return users;
    }

    @PostMapping(value="/addUser", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public UserModel addUser(@RequestBody UserModel user) {
        authService.createUser(user);
        return user;
    }

    @PutMapping("/userEdit/{id}")
    public UserModel userEditSave(@PathVariable String id, @RequestBody UserModel user) {
        authService.createUser(user);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    public UserModel userDelete(@PathVariable String id) {
        UserModel user = adminService.deleteUser(id);
        return user;
    }
}
