package com.SpringifyMongo.service;

import com.SpringifyMongo.model.Song;

import java.util.List;

public interface SongService {
    public Song saveSong(Song song);
    public List<Song> listSongs();
}
