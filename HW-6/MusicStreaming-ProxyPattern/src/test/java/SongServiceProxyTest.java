import org.example.Song;
import org.example.SongServiceProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SongServiceProxyTest {
    private SongServiceProxy songServiceProxy;

    @BeforeEach
    void setUp() {
        this.songServiceProxy = new SongServiceProxy();
        songServiceProxy.getCache().add(new Song(1, "Hey Jude", "Revolver", "07:08"));
    }
@Test
    public void searchByIdTest() throws Exception {
    Integer songId = 1;


    Song result = this.songServiceProxy.searchById(songId);


    assertNotNull(result);
    assertEquals("Hey Jude", result.getTitle());

}


@Test
    public void SearchByTitleTest(){

    String titleSearch = "Hey";
    List<Song> result = songServiceProxy.searchByTitle(titleSearch);

    assertNotNull(result);
    assertEquals(1, result.size());
    assertTrue(result.stream().anyMatch(song -> song.getTitle().equals("Hey Jude")));
}

@Test
    public void SearchByAlbumTest(){
    // Arrange
    String albumSearch = "Revolver";  // Should match albums in the cache

    // Act
    List<Song> result = songServiceProxy.searchByAlbum(albumSearch);

    // Assert
    assertNotNull(result);
    assertEquals(1, result.size());  // Expecting 2 matches from the cache
    assertTrue(result.stream().anyMatch(song -> song.getAlbum().equals("Revolver")));
}
}
