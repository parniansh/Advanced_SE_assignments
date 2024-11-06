package org.example.food.add_ons;

import org.example.food.Food;

public class Onion extends AddOn {

    public Onion(Food food) {
        super(food);
    }

    @Override
    public int price() {
        return food.price() + 1;
    }
}
