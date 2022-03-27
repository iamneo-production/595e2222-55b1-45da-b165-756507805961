package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="LoginModel", uniqueConstraints=@UniqueConstraint(columnNames={"email"}))
public class LoginModel {
    @Id
    private String email;

    private String password;

    public LoginModel() {
        
    }

    public LoginModel(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
