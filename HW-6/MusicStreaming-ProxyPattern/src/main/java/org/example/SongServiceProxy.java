package org.example;


import java.util.ArrayList;
import java.util.List;

public class SongServiceProxy implements SongService {

    private final List<Song> cache = new ArrayList<>();
    private SongMetadataService songMetadataService;


    private SongMetadataService getSongMetadataServiceInstance() {
        if (songMetadataService == null) {
            songMetadataService = new SongMetadataService();  // Connects to the server or does initialization
        }
        return songMetadataService;
    }

    @Override
    public Song searchById(Integer songId) throws Exception {
        for (Song song : cache) {
            if (song.getId() == songId) {
                System.out.println("From cache... No delay");
                return song;
            }
        }
        Song song = getSongMetadataServiceInstance().searchById(songId);
        cache.add(song);
        return song;

    }


    @Override
    public List<Song> searchByTitle(String title) {
        List<Song> list = new ArrayList<>();
        for (Song song : cache) {
            if (song.getTitle().toLowerCase().contains(title.toLowerCase())) {
                list.add(song);
            }
            if (!list.isEmpty()) {
                System.out.println("From cache... No delay");
                return list;
            }

        }
        list = getSongMetadataServiceInstance().searchByTitle(title);
        cache.addAll(list);
        return list;
    }


    @Override
    public List<Song> searchByAlbum(String album) {
        List<Song> list = new ArrayList<>();
        for (Song song : cache) {
            if (song.getAlbum().toLowerCase().contains(album.toLowerCase())) {
                list.add(song);
            }
            if (!list.isEmpty()) {
                System.out.println("From cache... No delay");
                return list;
            }
        }
        list = getSongMetadataServiceInstance().searchByAlbum(album);
        cache.addAll(list);
        return list;
    }

    public List<Song> getCache() {
        return cache;
    }
}
