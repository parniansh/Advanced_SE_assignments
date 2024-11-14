import org.example.Song;
import org.example.SongMetadataService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SongMetadataServiceTest {

    @Test
    public void searchByIdTest(){
        SongMetadataService songMetadataService = new SongMetadataService();
        Integer nonExistingSongId = 999;

        Exception exception = assertThrows(Exception.class, () -> {
            songMetadataService.searchById(nonExistingSongId);
        });

        assertEquals("Song with ID " + nonExistingSongId + " not found.", exception.getMessage());

    }

    @Test
    public  void searchByTitleTest(){
        SongMetadataService songMetadataService = new SongMetadataService();
        String titleSearch = "Bohemian"; // Search term
        Song song = new Song(2,"Bohemian Rhapsody","The Dark Side of the Moon","05:55");
        List<Song> mockFoundSongs = new ArrayList<>();
        mockFoundSongs.add(song);

        List<Song> foundSongs = songMetadataService.searchByTitle(titleSearch);

        assertNotNull(foundSongs);
        assertEquals(1, foundSongs.size());
    }

    @Test
    public void searchByAlbumTest(){

        SongMetadataService songMetadataService = new SongMetadataService();
        String albumSearch = "The Wall";


        List<Song> foundSongs = songMetadataService.searchByAlbum(albumSearch);


        assertNotNull(foundSongs);
        assertEquals(1, foundSongs.size()); // Only "Love Yourself" should match
        assertTrue(foundSongs.stream().anyMatch(song -> song.getAlbum().equals("The Wall")));
    }

}
