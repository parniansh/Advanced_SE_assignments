package org.example;

import java.util.*;

public class ChatServer implements Mediator {
    private final Map<String, User> users = new HashMap<>();
    private final Map<User, Set<User>> blockedUsers = new HashMap<>();

    @Override
    public void registerUser(User user) {
        users.put(user.getName(), user);
        blockedUsers.put(user, new HashSet<>());
    }

    @Override
    public void unregisterUser(User user) {
        users.remove(user.getName());
        blockedUsers.remove(user);
    }

    @Override
    public void sendMessage(User sender, List<User> recipients, String content) {

        Message message = new Message(sender, recipients,content);
        for (User recipient : recipients) {
            if (!blockedUsers.getOrDefault(recipient, Collections.emptySet()).contains(sender)) {
                recipient.receiveMessage(message);
            }
        }
        sender.addToHistory(message);
    }

    public void removeMessageFromRecipients(Message message) {
        for (User recipient : message.getRecipients()) {
            recipient.removeMessage(message);
        }
    }

    @Override
    public void blockUser(User blocker, User blockee) {
        if (blockedUsers.containsKey(blocker)) {
            blockedUsers.get(blocker).add(blockee);
        }
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public Map<User, Set<User>> getBlockedUsers() {
        return blockedUsers;
    }
}
