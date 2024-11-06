package org.example;

import org.example.food.Burger;
import org.example.food.HotDog;
import org.example.food.add_ons.Avocado;
import org.example.food.add_ons.Ketchup;
import org.example.food.add_ons.Mustard;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Parnian");
        Burger burger = new Burger();
        Ketchup burgerWithKetchup = new Ketchup(burger);
        Avocado burgerWithAvocado = new Avocado(burgerWithKetchup);
        customer.addToOrder(burgerWithAvocado);

        HotDog hotDog = new HotDog();
        Mustard hotdogWithMustard = new Mustard(hotDog);
        customer.addToOrder(hotdogWithMustard);

        int price = customer.CalculateOrderPrice();
        System.out.println(customer.toString() );
        System.out.println("Price after discount: " + Loyalty.applyDiscount(price, "VIP"));


    }
}