import org.example.ChatServer;
import org.example.Mediator;
import org.example.Message;
import org.example.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private Mediator chatServer;
    private User alice;
    private User bob;
    private User charlie;

    @BeforeEach
    void setUp() {
        chatServer = new ChatServer();
        alice = new User("Alice", chatServer);
        bob = new User("Bob", chatServer);
        charlie = new User("Charlie", chatServer);
    }

    @Test
    void sendMessageTest() {
        alice.sendMessage(List.of(bob, charlie), "Hello everyone!");

        assertNotNull(alice.iterator(bob).next());
        assertNotNull(alice.iterator(charlie).next());

        Message receivedByBob = bob.iterator(alice).next();
        assertEquals("Hello everyone!", receivedByBob.getContent());
    }

    @Test
    void undoLastMessageTest() {

        alice.sendMessage(List.of(bob), "How are you, Bob?");
        assertNotNull(alice.iterator(bob).next());

        alice.undoLastMessage();

        assertFalse(alice.iterator(bob).hasNext());
        assertFalse(bob.iterator(alice).hasNext());
    }

    @Test
    void receiveMessageTest() {

        bob.sendMessage(List.of(alice), "Hi Alice!");

        Message receivedByAlice = alice.iterator(bob).next();
        assertEquals("Hi Alice!", receivedByAlice.getContent());
        assertEquals(bob, receivedByAlice.getSender());
    }

    @Test
    void removeMessageTest() {

        alice.sendMessage(List.of(bob), "Test message");
        Message sentMessage = alice.iterator(bob).next();

        alice.removeMessage(sentMessage);

        assertFalse(alice.iterator(bob).hasNext());
    }
}
