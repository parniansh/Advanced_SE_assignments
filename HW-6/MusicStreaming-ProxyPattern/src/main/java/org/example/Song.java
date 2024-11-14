package org.example;

public class Song {
    private int id;
    private String title;
    private String album;
    private String duration;

    public Song(int id, String title, String album, String duration) {
        this.id = id;
        this.title = title;
        this.album = album;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public String getDuration() {
        return duration;
    }
}
