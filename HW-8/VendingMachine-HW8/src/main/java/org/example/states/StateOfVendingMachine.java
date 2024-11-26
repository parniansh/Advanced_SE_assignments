package org.example.states;

import org.example.VendingMachine;
import org.example.handlers.SnackDispenseHandler;

public abstract class StateOfVendingMachine {

     protected VendingMachine vendingMachine;

    public StateOfVendingMachine(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public abstract void selectSnack();
    public abstract void insertMoney();
    public abstract void dispenseSnack();

}
