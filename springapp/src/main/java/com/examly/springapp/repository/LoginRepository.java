package com.examly.springapp.repository;

import java.util.Optional;

import com.examly.springapp.model.LoginModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel, Long> {

    @Query("select u from LoginModel u where u.email=?1")
    Optional<LoginModel> findByEmail(String email);

}