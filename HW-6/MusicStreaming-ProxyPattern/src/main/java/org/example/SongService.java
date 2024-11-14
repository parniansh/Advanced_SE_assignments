package org.example;

import java.util.List;
import java.util.Optional;

public interface SongService {

    Song searchById(Integer songId) throws Exception;
    List<Song> searchByTitle(String title);
    List<Song> searchByAlbum(String album);
}
