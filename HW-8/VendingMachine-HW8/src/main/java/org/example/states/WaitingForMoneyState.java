package org.example.states;

import org.example.Snack;
import org.example.VendingMachine;
import org.example.handlers.SnackDispenseHandler;

public class WaitingForMoneyState extends StateOfVendingMachine{

    public WaitingForMoneyState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void selectSnack() {
        // Do nothing
    }

    @Override
    public void insertMoney() {
        int price = 0;
        for(Snack snack: vendingMachine.getSnacks()){
            if(snack.getName().equals(vendingMachine.getSelectedSnack())){
                price = snack.getPrice();
            }
        }
        if(vendingMachine.getInsertedMoney() < price){
            System.out.println("Not enough money ... ");
            System.out.println("Returning money ... ");
            vendingMachine.setState(new IdleState(vendingMachine));
        }else{
            System.out.println("Money's been inserted");
            vendingMachine.setState(new DispensingSnacksState(vendingMachine));
            vendingMachine.dispenseSnack();
        }
    }

    @Override
    public void dispenseSnack() {
        // Do nothing
    }


}
