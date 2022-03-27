package com.examly.springapp.controller;

import com.examly.springapp.model.LikeModel;
import com.examly.springapp.model.LoginModel;
import com.examly.springapp.service.AuthService;
import com.examly.springapp.service.CommentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CommentController {

    @Autowired
    AuthService authService;

    @Autowired
    CommentService commentService;
    

    @PostMapping(value="like/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public LikeModel addLike(@PathVariable String id, @RequestBody LoginModel login) {
        LikeModel like = commentService.addLike(id,login);
        return like;
    }

    @DeleteMapping(value="like/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public LikeModel removeLike(@PathVariable String id, @RequestBody LoginModel login) {
        LikeModel like = commentService.deleteLike(id, login);
        return like;
    }

    @GetMapping("admin/comment")
    public Integer getLikeCount(@PathVariable String id) {
        Integer likes = commentService.getLikeCount(id);
        return likes;
    }

}
