package org.example;

import org.example.Enums.Chain;
import org.example.Enums.PizzaSize;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PizzaChain PizzaHut = new PizzaChain(Chain.PIZZAHUT);
        PizzaHut.addPizza(new Pizza.PizzaBuilder(PizzaSize.LARGE).addPepperoni().addBacon().addBeef().build());
        PizzaHut.addPizza(new Pizza.PizzaBuilder(PizzaSize.SMALL).addBeef().addHamPineapple().build());
        PizzaHut.eat();

        PizzaChain LittleCaesars = new PizzaChain(Chain.LITTLECAESAR);
        LittleCaesars.addPizza(new Pizza.PizzaBuilder(PizzaSize.MEDIUM)
                .addHamPineapple()
                .addChicken()
                .addMushrooms()
                .addBeef()
                .addOlives()
                .addExtraCheese()
                .addOnions()
                .addSausage()
                .build());
        LittleCaesars.addPizza(new Pizza.PizzaBuilder(PizzaSize.SMALL)
                .addBeef()
                .addBacon()
                .addExtraCheese()
                .addHam()
                .addOlives()
                .addSausage().build());
        LittleCaesars.eat();

        PizzaChain Dominos = new PizzaChain(Chain.DOMINOS);
        Dominos.addPizza(new Pizza.PizzaBuilder(PizzaSize.SMALL).addSausage().build());
        Dominos.addPizza(new Pizza.PizzaBuilder(PizzaSize.LARGE).addSausage().addHam().addOlives().build());
        Dominos.eat();

    }
}