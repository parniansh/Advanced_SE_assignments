package org.example.food.add_ons;

import org.example.food.Food;

public class Mustard extends AddOn{
    public Mustard(Food food) {
        super(food);
    }

    @Override
    public int price() {
        return food.price() + 2;
    }
}
