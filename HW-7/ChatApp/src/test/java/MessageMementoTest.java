import org.example.MessageMemento;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MessageMementoTest {

    @Test
    void messageMementoStoresAndRetrievesValuesTest() {

        String expectedContent = "Test message";
        LocalDateTime expectedTimestamp = LocalDateTime.now();

        MessageMemento memento = new MessageMemento(expectedContent, expectedTimestamp);

        assertEquals(expectedContent, memento.getContent());
        assertEquals(expectedTimestamp, memento.getTimestamp());
    }

    @Test
    void messageMementoHandlesNullValuesTest() {
        MessageMemento memento = new MessageMemento(null, null);

        assertNull(memento.getContent());
        assertNull(memento.getTimestamp());
    }
}

