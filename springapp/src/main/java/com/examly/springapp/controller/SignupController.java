package com.examly.springapp.controller;

import com.examly.springapp.model.UserModel;
import com.examly.springapp.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SignupController {
    @Autowired
    private AuthService authService;

    @PostMapping(value="signup", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Boolean saveUser(@RequestBody UserModel user) {
        Boolean status = authService.createUser(user);
        return status;
    }
}
