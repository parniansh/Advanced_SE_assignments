package org.example.states;

import org.example.VendingMachine;
import org.example.handlers.SnackDispenseHandler;

public class IdleState extends StateOfVendingMachine{

    public IdleState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void selectSnack() {
        vendingMachine.setState(new WaitingForMoneyState(vendingMachine));
        System.out.println(vendingMachine.getSelectedSnack() + " is selected");
        System.out.println("Please insert money");
    }

    @Override
    public void insertMoney() {
        // Do nothing

    }

    @Override
    public void dispenseSnack() {
        // Do nothing
    }


}
