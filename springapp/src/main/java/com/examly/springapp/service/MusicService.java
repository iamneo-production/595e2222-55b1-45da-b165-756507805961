package com.examly.springapp.service;

import java.util.List;
import java.util.Optional;

import com.examly.springapp.model.MusicModel;
import com.examly.springapp.repository.MusicRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicService {
    @Autowired
    MusicRepository musicRepository;

    public MusicModel addMusic(MusicModel music) {
        MusicModel addedMusic = musicRepository.save(music);
        return addedMusic;
    }

    public Boolean updateMusic(String id, MusicModel music) {
        if (id.equals(music.getMusicId())) {
            musicRepository.save(music);
            return true;
        }
        return false;
    }

    public List<MusicModel> getAllMusic() {
        List<MusicModel> music = musicRepository.findAll();
        return music;
    }

    public MusicModel deleteMusic(String id) {
        Optional<MusicModel> music = musicRepository.findById(id);
        musicRepository.delete(music.get());
        return music.get();
    }
}
