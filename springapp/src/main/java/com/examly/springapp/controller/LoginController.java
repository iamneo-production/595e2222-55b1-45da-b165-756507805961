package com.examly.springapp.controller;

import com.examly.springapp.model.LoginModel;
import com.examly.springapp.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {
    @Autowired
    private AuthService authService;

    @PostMapping(value="login", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Boolean checkUser(@RequestBody LoginModel data) {
        Boolean status = authService.checkUser(data);
        if (status) {
            Boolean statusSet = authService.setUserActive(data, status);
            return statusSet;
        }
        return status;
    }
}
