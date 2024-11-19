package org.example;

import java.util.List;

public interface Mediator {
    void registerUser(User user);
    void unregisterUser(User user);
    void sendMessage(User sender, List<User> recipients, String content);
    void blockUser(User blocker, User blockee);
}
