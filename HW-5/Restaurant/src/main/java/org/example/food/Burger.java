package org.example.food;

public class Burger extends Food{
    public Burger() {
        this.name = "Burger";
    }

    @Override
    public int price() {
        return 6;
    }
}
