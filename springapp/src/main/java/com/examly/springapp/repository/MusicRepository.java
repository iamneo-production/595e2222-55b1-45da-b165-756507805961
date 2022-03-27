package com.examly.springapp.repository;

import java.util.Optional;

import com.examly.springapp.model.MusicModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<MusicModel, Long> {
    
    @Query("select u from MusicModel u where u.musicId=?1")
    Optional<MusicModel> findById(String id);

}