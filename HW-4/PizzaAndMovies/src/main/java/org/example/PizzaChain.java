package org.example;

import org.example.Enums.Chain;

import java.util.ArrayList;


public class PizzaChain {
    private Chain name;
    private final ArrayList<Pizza> pizzaList = new ArrayList<>();

    public PizzaChain(Chain name) {
        this.name = name;
    }

    public Chain getName() {
        return name;
    }

    public void setName(Chain name) {
        this.name = name;
    }
    public void addPizza(Pizza pizza){
        this.pizzaList.add(pizza);
    }


    public void eat() {

        StringBuilder sb = new StringBuilder();
        sb.append("Chain Name: ").append(name).append("\n");
        sb.append("Pizzas:").append("\n");

        for (Pizza pizza : pizzaList) {
            sb.append(" - ").append(pizza.toString()).append("\n");
        }

        System.out.println(sb);
    }
}
