package org.example.handlers;

import java.util.Objects;

public class Snickers extends SnackDispenseHandler{

    public Snickers(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(String request) {
        if(Objects.equals(request, "Snickers")){
            System.out.println("Snickers is dispensed");
        }
        else{
            System.out.println("passed Snickers");
            super.handleRequest(request);
        }

    }
}
