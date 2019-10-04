package com.SpringifyMongo.repository;

import com.SpringifyMongo.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongRepository extends MongoRepository<Song, String> {
}
