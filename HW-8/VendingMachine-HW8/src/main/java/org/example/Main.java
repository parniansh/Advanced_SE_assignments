package org.example;

import org.example.handlers.*;
import org.example.states.IdleState;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine(
                new Coke(
                new Pepsi(
                new Cheetos(
                new Doritos(
                new KitKat(
                new Snickers(null)
                ))))));
        vendingMachine.addSnack(new Snack("Coke", 1,2));
        vendingMachine.addSnack(new Snack("Pepsi", 2, 2));
        vendingMachine.addSnack(new Snack("Cheetos", 3, 2));
        vendingMachine.addSnack(new Snack("Doritos", 4, 2));
        vendingMachine.addSnack(new Snack("KitKat", 5, 2));
        vendingMachine.addSnack(new Snack("Snickers", 6, 1));

        System.out.println("-------Case: buying Coke---------");
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(3);

        System.out.println("-------Case: buying Pepsi---------");
        vendingMachine.selectSnack("Pepsi");
        vendingMachine.insertMoney(3);

        System.out.println("-------Case: buying Cheetos---------");
        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(3);

        System.out.println("-------Case: buying Doritos---------");
        vendingMachine.selectSnack("Doritos");
        vendingMachine.insertMoney(4);

        System.out.println("-------Case: buying KitKat, Not enough money---------");
        vendingMachine.selectSnack("KitKat");
        vendingMachine.insertMoney(4);

        System.out.println("-------Case: buying Snickers---------");
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(6);

        System.out.println("-------Case: Out of snickers-----");
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(6);



    }
}