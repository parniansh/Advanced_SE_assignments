package org.example;

import org.example.handlers.SnackDispenseHandler;
import org.example.states.IdleState;
import org.example.states.StateOfVendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private StateOfVendingMachine state;
    private List<Snack> snacks = new ArrayList<>();
    private String selectedSnack;
    private int insertedMoney;
    private SnackDispenseHandler handler;


    public VendingMachine(SnackDispenseHandler handler) {
        this.handler = handler;
        this.state = new IdleState(this);
        this.snacks = new ArrayList<>();
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }
    public void addSnack(Snack snack){
        snacks.add(snack);
    }

    public int getInsertedMoney() {
        return insertedMoney;
    }

    public List<Snack> getSnacks() {
        return snacks;
    }

    public StateOfVendingMachine getState() {
        return state;
    }

    public void selectSnack(String snack){
        selectedSnack = snack;
        getState().selectSnack();
    }

    public void insertMoney(int money){
        insertedMoney = money;
        getState().insertMoney();
    }

    public  void dispenseSnack(){

        getState().dispenseSnack();
    }

    public SnackDispenseHandler getHandler() {
        return handler;
    }

    public String getSelectedSnack() {
        return selectedSnack;
    }

    public void setSelectedSnack(String selectedSnack) {
        this.selectedSnack = selectedSnack;
    }
}
