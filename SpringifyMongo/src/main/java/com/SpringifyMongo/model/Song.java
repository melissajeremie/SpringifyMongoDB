package com.SpringifyMongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Song {
    @Id
    private String id;
    private String title;
    private String artist;
    private String length;

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getArtist() {return artist;}
    public void setArtist(String artist) {this.artist = artist;}

    public String getLength() {return length;}
    public void setLength(String length) {this.length = length;}
}
