package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="MusicModel", uniqueConstraints=@UniqueConstraint(columnNames={"musicId"}))
public class MusicModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String musicId;

    private String musicName;

    private String musicUrl;

    private String musicPosterUrl;

    private String musicAlbum;

    private String musicArtist;

    private LikeModel like;

    public MusicModel() {
        
    }

    public MusicModel(String musicName, String musicUrl, String musicPosterUrl, String musicAlbum, String musicArtist, LikeModel like) {
        super();
        this.musicName = musicName;
        this.musicUrl = musicUrl;
        this.musicPosterUrl = musicPosterUrl;
        this.musicAlbum = musicAlbum;
        this.musicArtist = musicArtist;
        this.like = like;
    }

    public String getMusicId() {
        return musicId;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicUrl(String musicUrl) {
        this.musicUrl = musicUrl;
    }

    public String getMusicUrl() {
        return musicUrl;
    }

    public void setMusicPosterUrl(String musicPosterUrl) {
        this.musicPosterUrl = musicPosterUrl;
    }

    public String getMusicPosterUrl() {
        return musicPosterUrl;
    }

    public void setMusicAlbum(String musicAlbum) {
        this.musicAlbum = musicAlbum;
    }

    public String getMusicAlbum() {
        return musicAlbum;
    }

    public void setMusicArtist(String musicArtist) {
        this.musicArtist = musicArtist;
    }

    public String getMusicArtist() {
        return musicArtist;
    }

    public void setLike(LikeModel like) {
        this.like = like;
    }

    public LikeModel getLike() {
        return like;
    }
}
