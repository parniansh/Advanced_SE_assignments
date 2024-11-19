import org.example.ChatServer;
import org.example.Message;
import org.example.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChatServerTest {
    private ChatServer chatServer;
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
    void testRegisterUser() {
        assertTrue(chatServer.getUsers().containsKey("Alice"));
        assertTrue(chatServer.getUsers().containsKey("Bob"));
        assertTrue(chatServer.getUsers().containsKey("Charlie"));
    }

    @Test
    void unregisterUserTest() {
        chatServer.unregisterUser(bob);

        assertFalse(chatServer.getUsers().containsKey("Bob"));
        assertFalse(chatServer.getBlockedUsers().containsKey(bob));
    }

    @Test
    void sendMessageTest() {

        chatServer.sendMessage(alice, List.of(bob, charlie), "Hello everyone!");

        Message aliceMessage = alice.iterator(bob).next();
        assertEquals("Hello everyone!", aliceMessage.getContent());

        Message bobMessage = bob.iterator(alice).next();
        assertEquals("Hello everyone!", bobMessage.getContent());
        assertEquals(alice, bobMessage.getSender());

        Message charlieMessage = charlie.iterator(alice).next();
        assertEquals("Hello everyone!", charlieMessage.getContent());
        assertEquals(alice, charlieMessage.getSender());
    }

    @Test
    void removeMessageFromRecipientsTest() {
        chatServer.sendMessage(alice, List.of(bob, charlie), "Hello everyone!");
        Message message = alice.iterator(bob).next();

        chatServer.removeMessageFromRecipients(message);

        assertFalse(bob.iterator(alice).hasNext());
        assertFalse(charlie.iterator(alice).hasNext());
    }

    @Test
    void blockUserTest() {

        chatServer.blockUser(charlie, alice);
        chatServer.sendMessage(alice, List.of(charlie), "Hi Charlie!");
        assertFalse(charlie.iterator(alice).hasNext());
    }
}
