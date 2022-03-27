package com.examly.springapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="LikeModel", uniqueConstraints=@UniqueConstraint(columnNames={"Id"}))
public class LikeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Id;

    private Integer noOfLike;

    private List<UserModel> likedUser;

    public LikeModel() {
        
    }

    public LikeModel(Integer noOfLike, UserModel user) {
        super();
        this.noOfLike = noOfLike;
        this.likedUser.add(user);
    }

    public String getId() {
        return Id;
    }

    public void setNoOfLike(Integer noOfLike) {
        this.noOfLike = noOfLike;
    }

    public Integer getNoOfLike() {
        return noOfLike;
    }

    public void setLikedUsers(List<UserModel> users) {
        this.likedUser = users;
    }

    public List<UserModel> getLikedUsers() {
        return likedUser;
    }
}
