package org.example;

public interface PizzaBuilderInterface {



    public Pizza.PizzaBuilder addPepperoni();
    public Pizza.PizzaBuilder addSausage();
    public Pizza.PizzaBuilder addMushrooms();
    public Pizza.PizzaBuilder addBacon();
    public Pizza.PizzaBuilder addOnions();
    public Pizza.PizzaBuilder addExtraCheese();
    public Pizza.PizzaBuilder addPeppers();
    public Pizza.PizzaBuilder addChicken();
    public Pizza.PizzaBuilder addOlives();
    public Pizza.PizzaBuilder addSpinach();
    public Pizza.PizzaBuilder addTomatoBasil();
    public Pizza.PizzaBuilder addBeef();
    public Pizza.PizzaBuilder addHam();
    public Pizza.PizzaBuilder addPesto();
    public Pizza.PizzaBuilder addSpicyPork();
    public Pizza.PizzaBuilder addHamPineapple();

    public Pizza build();
}
