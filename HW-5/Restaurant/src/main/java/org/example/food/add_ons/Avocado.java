package org.example.food.add_ons;

import org.example.food.Food;

public class Avocado extends AddOn{

    public Avocado(Food food) {
        super(food);
    }

    @Override
    public int price() {
        return food.price() + 3;
    }
}
