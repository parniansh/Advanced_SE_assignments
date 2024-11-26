package org.example.handlers;

import java.util.Objects;

public class Cheetos extends SnackDispenseHandler{

    public Cheetos(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(String request) {
        if(Objects.equals(request, "Cheetos")){
            System.out.println("Cheetos is dispensed");
        }
        else{
            System.out.println("passed Cheetos");
            super.handleRequest(request);
        }

    }
}
