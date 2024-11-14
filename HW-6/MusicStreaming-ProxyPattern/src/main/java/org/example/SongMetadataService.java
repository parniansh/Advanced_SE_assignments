package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SongMetadataService implements SongService{

    private String filePath = "C:/Users/parni/IdeaProjects/MusicStreaming-ProxyPattern/src/main/java/org/example/songs.txt";
    List<Song> foundSongs = new ArrayList<>();

    public SongMetadataService() {
    }

    @Override
    public Song searchById(Integer songId) throws Exception {
        try {
            System.out.println("Searching for songs in the file... Please wait a moment(one second delay)");
            Thread.sleep(1000);
        } catch (Exception e) {}

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4 && Integer.parseInt(data[0]) == songId) {
                    Song song = new Song(songId, data[1], data[2], data[3]);
                    return song;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new Exception("Song with ID " + songId + " not found.");
    }

    @Override
    public List<Song> searchByTitle(String titleSearch) {

        try {
            System.out.println("Searching for songs in the file... Please wait a moment(one second delay)");
            Thread.sleep(1000);
        } catch (Exception e) {}
        foundSongs.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    int id = Integer.parseInt(parts[0].trim());
                    String title = parts[1].trim();
                    String album = parts[2].trim();
                    String duration = parts[3].trim();

                    if (title.toLowerCase().contains(titleSearch.toLowerCase())) {
                        foundSongs.add(new Song(id, title, album, duration));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        return foundSongs;
    }

    @Override
    public List<Song> searchByAlbum(String albumSearch) {
        try {
            System.out.println("Searching for songs in the file... Please wait a moment(one second delay)");
            Thread.sleep(1000);
        } catch (Exception e) {}

        foundSongs.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    int id = Integer.parseInt(parts[0].trim());
                    String title = parts[1].trim();
                    String album = parts[2].trim();
                    String duration = parts[3].trim();

                    if (album.toLowerCase().contains(albumSearch.toLowerCase())) {
                        foundSongs.add(new Song(id, title, album, duration));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        return foundSongs;
    }
}
