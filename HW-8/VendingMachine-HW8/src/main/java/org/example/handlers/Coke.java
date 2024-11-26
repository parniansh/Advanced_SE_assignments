package org.example.handlers;

import org.example.Snack;
import org.example.VendingMachine;
import org.example.states.WaitingForMoneyState;

import java.util.Objects;

public class Coke extends SnackDispenseHandler {

    public Coke( SnackDispenseHandler next) {

        super(next);
    }

    @Override
    public void handleRequest(String request) {
        if(Objects.equals(request, "Coke")){
            System.out.println("Coke is dispensed");
        }
        else{
            System.out.println("passed coke");
            super.handleRequest(request);
        }

    }


}
