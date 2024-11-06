package org.example.food.add_ons;

import org.example.food.Food;

public class Ketchup extends AddOn{
    public Ketchup(Food food) {
        super(food);
    }

    @Override
    public int price() {
        return food.price() + 1;
    }
}
