package com.examly.springapp.controller;

import java.util.List;

import com.examly.springapp.model.MusicModel;
import com.examly.springapp.service.MusicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MusicController {
    @Autowired
    MusicService musicService;
    
    @PostMapping("admin/addMusic")
    public MusicModel addMusic(MusicModel music) {
        MusicModel addedMusic = musicService.addMusic(music);
        return addedMusic;
    }

    @GetMapping("admin/music")
    public List<MusicModel> getAllMusic() {
        List<MusicModel> music = musicService.getAllMusic();
        return music;
    }

    @DeleteMapping("admin/music/{id}")
    public MusicModel deleteMusic(@PathVariable String id) {
        MusicModel music = musicService.deleteMusic(id);
        return music;
    }

    @PutMapping(value="admin/music/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Boolean updateMusic(@PathVariable String id, @RequestBody MusicModel data) {
        Boolean status = musicService.updateMusic(id, data);
        return status;
    }
}
