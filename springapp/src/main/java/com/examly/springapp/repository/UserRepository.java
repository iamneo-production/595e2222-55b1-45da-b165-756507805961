package com.examly.springapp.repository;

import java.util.List;
import java.util.Optional;

import com.examly.springapp.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    
    @Query("select u from UserModel u where u.email=?1")
    Optional<UserModel> findByEmail(String email);

    @Query("select u from UserModel u where u.active=1")
    List<UserModel> findAllByActive();

}