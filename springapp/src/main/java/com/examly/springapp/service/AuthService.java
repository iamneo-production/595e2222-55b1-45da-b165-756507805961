package com.examly.springapp.service;

import java.util.Optional;

import com.examly.springapp.model.LoginModel;
import com.examly.springapp.model.UserModel;
import com.examly.springapp.repository.LoginRepository;
import com.examly.springapp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    LoginRepository loginRepository;

    public Boolean createUser(UserModel user) {
        try {
            this.userRepository.save(user);            
            LoginModel userLogin = new LoginModel(user.getEmail(), user.getPassword());
            this.loginRepository.save(userLogin);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public Boolean checkUser(LoginModel data) {
        Optional<LoginModel> user = this.loginRepository.findByEmail(data.getEmail());
        if (user.isPresent()) {   
            if (user.get().getPassword().equals(data.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public Boolean setUserActive(LoginModel data, Boolean status) {
        Optional<UserModel> user = this.userRepository.findByEmail(data.getEmail());
        if (user.isPresent()) {
            user.get().setActive(status);
            UserModel userData = user.get();
            this.userRepository.save(userData);
            return true;
        }
        return false;
    }

    public UserModel getUserModel(LoginModel data) {
        Optional<UserModel> user = this.userRepository.findByEmail(data.getEmail());
        return user.get();
    }
}
