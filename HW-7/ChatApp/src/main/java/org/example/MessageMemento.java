package org.example;

import java.time.LocalDateTime;
import java.util.Date;

public class MessageMemento {

    private final String content;
    private final LocalDateTime timestamp;

    public MessageMemento(String content, LocalDateTime timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
