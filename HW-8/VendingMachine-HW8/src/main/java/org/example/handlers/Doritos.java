package org.example.handlers;

import java.util.Objects;

public class Doritos extends SnackDispenseHandler{

    public Doritos(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(String request) {
        if(Objects.equals(request, "Doritos")){
            System.out.println("Doritos is dispensed");
        }
        else{
            System.out.println("passed Doritos");
            super.handleRequest(request);
        }

    }
}
