package com.SpringifyMongo.controller;

import com.SpringifyMongo.model.Song;
import com.SpringifyMongo.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/song")

public class SongController {
    @Autowired
    SongService songService;

    @GetMapping
    public List<Song> listSongs() {
        return songService.listSongs();
    }

    @PostMapping
    public Song saveSongs(@RequestBody Song song) {
        return songService.saveSong(song);
    }
}
