package com.examly.springapp.repository;

import com.examly.springapp.model.LikeModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<LikeModel, Long> {

    @Query("select u from LikeModel u where u.Id=?1")
    LikeModel findById(String id);

}