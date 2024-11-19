package org.example;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class User implements IterableByUser{
    private final String name;
    private final ChatHistory chatHistory = new ChatHistory();
    private MessageMemento lastMessageMemento;
    private final Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerUser(this);
    }

    public String getName() {
        return name;
    }

    public void sendMessage(List<User> recipients, String content) {
        lastMessageMemento = new MessageMemento(content, LocalDateTime.now());
        mediator.sendMessage(this, recipients, content);
    }

    public void undoLastMessage() {
        Message lastSentMessage = chatHistory.getLastMessageSentBy(this);
        if (lastSentMessage != null) {

            System.out.println(name + " undid the last message: " + lastSentMessage.getContent());
            chatHistory.removeMessage(lastSentMessage);
            ((ChatServer) mediator).removeMessageFromRecipients(lastSentMessage);

            lastMessageMemento = null;
        } else {
            System.out.println(name + " has no message to undo.");
        }
    }

    public void receiveMessage(Message message) {
        chatHistory.addMessage(message);
    }

    public void addToHistory(Message message) {
        chatHistory.addMessage(message);
    }

    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        return chatHistory.iterator(userToSearchWith);
    }

    public void removeMessage(Message message) {
        chatHistory.removeMessage(message);
    }
}
