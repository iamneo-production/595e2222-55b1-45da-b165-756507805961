package com.examly.springapp.service;

import java.util.List;
import java.util.Optional;

import com.examly.springapp.model.LikeModel;
import com.examly.springapp.model.LoginModel;
import com.examly.springapp.model.MusicModel;
import com.examly.springapp.model.UserModel;
import com.examly.springapp.repository.LikeRepository;
import com.examly.springapp.repository.MusicRepository;
import com.examly.springapp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    MusicRepository musicRepository;

    @Autowired
    LikeRepository likeRepository;

    @Autowired
    UserRepository userRepository;

    public Boolean getLikeExists(String id) {

        return false;
    }

    public LikeModel addLike(String id, LoginModel login) {
        Optional<MusicModel> omusic = musicRepository.findById(id);
        MusicModel music = omusic.get();
        LikeModel like = music.getLike();
        Optional<UserModel> ouser = userRepository.findByEmail(login.getEmail());
        UserModel user = ouser.get();
        List<UserModel> users = like.getLikedUsers();
        users.add(user);
        Integer likes = like.getNoOfLike() + 1;
        like.setNoOfLike(likes);
        like.setLikedUsers(users);
        music.setLike(like);
        musicRepository.save(music);
        likeRepository.save(like);
        return like;
    }

    public LikeModel deleteLike(String id, LoginModel login) {
        Optional<MusicModel> omusic = musicRepository.findById(id);
        MusicModel music = omusic.get();
        LikeModel like = music.getLike();
        Optional<UserModel> ouser = userRepository.findByEmail(login.getEmail());
        UserModel user = ouser.get();
        List<UserModel> users = like.getLikedUsers();
        users.remove(user);
        Integer likes = like.getNoOfLike() - 1;
        like.setNoOfLike(likes);
        like.setLikedUsers(users);
        music.setLike(like);
        musicRepository.save(music);
        likeRepository.save(like);
        return like;
    }

    public Integer getLikeCount(String id) {
        MusicModel music = musicRepository.findById(id).get();
        LikeModel like = music.getLike();
        return like.getNoOfLike();
    }
}
