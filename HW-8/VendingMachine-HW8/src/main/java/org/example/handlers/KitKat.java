package org.example.handlers;

import java.util.Objects;

public class KitKat extends SnackDispenseHandler{

    public KitKat(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(String request) {
        if(Objects.equals(request, "KitKat")){
            System.out.println("KitKat is dispensed");
        }
        else{
            System.out.println("passed KitKat");
            super.handleRequest(request);
        }

    }
}
