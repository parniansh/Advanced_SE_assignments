package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Mediator server = new ChatServer();

        User alice = new User("Alice", server);
        User bob = new User("Bob", server);
        User charlie = new User("Charlie", server);

        alice.sendMessage(List.of(bob, charlie), "Hi everyone!");
        bob.sendMessage(List.of(alice), "Hello Alice!");
        charlie.sendMessage(List.of(alice), "Hi Alice!");

        System.out.println("\nMessages between Alice and Bob before undo:");
        Iterator<Message> iterator = alice.iterator(bob);
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getContent());
        }

        System.out.println("\n");
        alice.undoLastMessage();

        server.blockUser(charlie, alice);

        // message not sent since charlie has blocked alice
        alice.sendMessage(List.of(charlie), "Charlie, can you see this?");

        System.out.println("\nMessages between Alice and Bob after undo:");
        iterator = alice.iterator(bob);
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getContent());
        }

        System.out.println("\nMessages between Charlie and Alice after undo:");
        iterator = charlie.iterator(alice);
        while (iterator.hasNext()) {

            System.out.println(iterator.next().getContent());
        }


    }
}