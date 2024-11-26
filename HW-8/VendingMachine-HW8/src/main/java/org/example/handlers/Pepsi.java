package org.example.handlers;

import org.example.VendingMachine;

import java.util.Objects;

public class Pepsi extends SnackDispenseHandler{

    public Pepsi( SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(String request) {
        if(Objects.equals(request, "Pepsi")){
            System.out.println("Pepsi is dispensed");
        }
        else{
            System.out.println("passed Pepsi");
            super.handleRequest(request);
        }

    }

}
