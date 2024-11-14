import org.example.Character;
import org.example.CharacterProperty;
import org.example.Color;
import org.example.Document;
import org.example.Font;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentTest {

    private Document document;

    @BeforeEach
    void setUp() {
        document = new Document();
    }
    @Test
    public void LoadFromFileTest() throws IOException {
        Path testFilePath = Files.createTempFile("testDocument", ".txt");
        String testData = "A,Arial,Black,12\nB,Calibri,Red,14";
        Files.writeString(testFilePath, testData);

        document.loadFromFile(testFilePath.toString());

        assertEquals(2, document.getCharacters().size());
    }


    @Test
    public void saveTest() throws IOException {
        CharacterProperty charProp1 = new CharacterProperty(Font.Arial, Color.Black, 12);
        CharacterProperty charProp2 = new CharacterProperty(Font.Calibri, Color.Red, 14);
        document.getCharacters().add(new org.example.Character('A', charProp1));
        document.getCharacters().add(new org.example.Character('B', charProp2));

        Path testFilePath = Files.createTempFile("testDocument", ".txt");

        String result = document.save(testFilePath.toString());
        assertEquals(testFilePath + " is successfully saved", result);
    }


    @Test
    public void addCharacterTest(){

        char character = 'A';
        Font font = Font.Arial;
        Color color = Color.Black;
        int size = 12;


        document.addCharacter(character, font, color, size);

        assertEquals(1, document.getCharacters().size());

        Character addedCharacter = document.getCharacters().get(0);
        assertEquals(character, addedCharacter.getCharacter());
        assertEquals(font, addedCharacter.getCharacterProperty().getFont());
        assertEquals(color, addedCharacter.getCharacterProperty().getColor());
        assertEquals(size, addedCharacter.getCharacterProperty().getSize());
    }
}
