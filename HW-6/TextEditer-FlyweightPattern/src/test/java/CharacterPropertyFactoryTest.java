import org.example.CharacterProperty;
import org.example.CharacterPropertyFactory;
import org.example.Color;
import org.example.Font;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CharacterPropertyFactoryTest {

    @Test
    void testGetCharacterProperty() {
        // Arrange
        Font font = Font.Arial;
        Color color = Color.Black;
        int size = 12;

        // Act
        CharacterProperty firstProperty = CharacterPropertyFactory.getCharacterProperty(font, color, size);
        CharacterProperty secondProperty = CharacterPropertyFactory.getCharacterProperty(font, color, size);

        // Assert
        assertNotNull(firstProperty);   // Ensures that the property was created
        assertSame(firstProperty, secondProperty);  // Ensures the same instance is returned for the same key
    }
}
