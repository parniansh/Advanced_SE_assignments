package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ChatHistory implements IterableByUser{

    private final List<Message> messages = new ArrayList<>();

    public void addMessage(Message message) {
        messages.add(message);
    }

    public Message getLastMessage() {
        return messages.isEmpty() ? null : messages.get(messages.size() - 1);
    }

    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        return new SearchMessagesByUser(userToSearchWith, messages);
    }

    public void removeMessage(Message message) {
        messages.remove(message);
    }

    public Message getLastMessageSentBy(User user) {
        for (int i = messages.size() - 1; i >= 0; i--) {
            if (messages.get(i).getSender().equals(user)) {
                return messages.get(i);
            }
        }
        return null;
    }
}

