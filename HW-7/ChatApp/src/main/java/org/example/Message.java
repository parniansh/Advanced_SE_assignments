package org.example;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Message {

    private final User sender;
    private final List<User> recipients;
    private final LocalDateTime timestamp;
    private final String content;

    public Message(User sender, List<User> recipients, String content) {
        this.sender = sender;
        this.recipients = recipients;
        this.timestamp = LocalDateTime.now();
        this.content = content;
    }

    public User getSender() {
        return sender;
    }

    public List<User> getRecipients() {
        return recipients;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }

//    @Override
//    public String toString() {
//        return "[" + timestamp + "] " + sender.getName() + " to " +
//                recipients.stream().map(User::getName).toList() + ": " + content;
//    }
}
