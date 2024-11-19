import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChatHistoryTest {
    private ChatHistory chatHistory;
    private User alice;
    private User bob;
    private User charlie;
    private Message message1;
    private Message message2;
    private Message message3;
    private Mediator chatServer;

    @BeforeEach
    void setUp() {
        chatServer = new ChatServer();
        chatHistory = new ChatHistory();
        alice = new User("Alice", chatServer);
        bob = new User("Bob", chatServer);
        charlie = new User("Charlie", chatServer);

        // Create some messages
        message1 = new Message(alice, List.of(bob, charlie), "Hello everyone!");
        message2 = new Message(bob, List.of(alice), "Hi Alice!");
        message3 = new Message(charlie, List.of(alice), "Hi Alice!");
    }

    @Test
    void addMessageTest() {
        chatHistory.addMessage(message1);
        assertEquals("Hello everyone!", chatHistory.iterator(alice).next().getContent());
    }

    @Test
    void getLastMessageTest() {

        chatHistory.addMessage(message1);
        chatHistory.addMessage(message2);
        chatHistory.addMessage(message3);

        assertEquals(message3, chatHistory.getLastMessage());
    }

    @Test
    void removeMessageTest() {
        chatHistory.addMessage(message1);
        chatHistory.addMessage(message2);

        chatHistory.removeMessage(message1);

        Iterator<Message> iterator = chatHistory.iterator(alice);
        while (iterator.hasNext()) {
            assertNotEquals(message1, iterator.next());
        }
    }

    @Test
    void getLastMessageSentByTest() {

        chatHistory.addMessage(message1);
        assertEquals(message1, chatHistory.getLastMessageSentBy(alice) );
    }

    @Test
    void iteratorFiltersMessagesByUserTest() {

        chatHistory.addMessage(message1);
        chatHistory.addMessage(message2);
        chatHistory.addMessage(message3);

        Iterator<Message> iterator = chatHistory.iterator(alice);

        List<Message> aliceMessages = new ArrayList<>();
        while (iterator.hasNext()) {
            aliceMessages.add(iterator.next());
        }

        assertEquals(3, aliceMessages.size());
        assertTrue(aliceMessages.contains(message1));
        assertTrue(aliceMessages.contains(message2));
        assertTrue(aliceMessages.contains(message3));
    }
}

