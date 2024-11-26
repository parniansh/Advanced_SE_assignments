package org.example.handlers;

import org.example.Snack;
import org.example.VendingMachine;

public abstract class SnackDispenseHandler {

    private SnackDispenseHandler next;

    public SnackDispenseHandler(SnackDispenseHandler next) {
        this.next = next;
    }

    public void handleRequest(String request){
        if(next != null){
            next.handleRequest(request);
        }
    }


}
