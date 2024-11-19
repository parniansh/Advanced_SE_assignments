import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchMessagesByUserTest {
    private User alice;
    private User bob;
    private User charlie;
    private List<Message> messages;
    private Mediator chatServer;


    @BeforeEach
    void setUp() {
        chatServer = new ChatServer();
        alice = new User("Alice", chatServer);
        bob = new User("Bob", chatServer);
        charlie = new User("Charlie", chatServer);

        messages = new ArrayList<>();
        messages.add(new Message(alice, List.of(bob, charlie), "Hello everyone!"));
        messages.add(new Message(bob, List.of(alice), "Hi Alice!"));
        messages.add(new Message(charlie, List.of(alice), "Hi Alice!"));
    }

    @Test
    void hasNextWhenMessagesExistTest() {

        SearchMessagesByUser iterator = new SearchMessagesByUser(alice, messages);
        assertTrue(iterator.hasNext());
    }

    @Test
    void hasNextWhenNoMessagesExistTest() {

        SearchMessagesByUser iterator = new SearchMessagesByUser(new User("Unknown", chatServer), messages);
        assertFalse(iterator.hasNext());
    }
}

