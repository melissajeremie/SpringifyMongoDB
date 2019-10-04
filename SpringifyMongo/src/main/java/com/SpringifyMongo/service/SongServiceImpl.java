package com.SpringifyMongo.service;

import com.SpringifyMongo.model.Song;
import com.SpringifyMongo.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService{
    @Autowired
    SongRepository songRepository;

    @Override
    public Song saveSong(Song song) {
        return songRepository.save(song);
    }

    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }
}
