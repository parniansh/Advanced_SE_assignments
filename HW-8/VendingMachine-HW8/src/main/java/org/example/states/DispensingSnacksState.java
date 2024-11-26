package org.example.states;

import org.example.Snack;
import org.example.VendingMachine;
import org.example.handlers.SnackDispenseHandler;

public class DispensingSnacksState extends StateOfVendingMachine{

    public DispensingSnacksState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void selectSnack() {
        // Do nothing
    }

    @Override
    public void insertMoney() {
        // Do nothing
    }

    @Override
    public void dispenseSnack( ) {
        for(Snack snack: vendingMachine.getSnacks()){
            if(snack.getName().equals(vendingMachine.getSelectedSnack())){
                if(snack.getQuantity()> 0 ){
                    snack.setQuantity(snack.getQuantity()-1);
                    vendingMachine.getHandler().handleRequest(vendingMachine.getSelectedSnack());
                }
                else{
                    System.out.println("out of " + vendingMachine.getSelectedSnack());
                    System.out.println("Returning money...");
                }
            }
        }
        vendingMachine.setState(new IdleState(vendingMachine));
    }


}
