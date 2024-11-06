package org.example.food.add_ons;

import org.example.food.Food;

public abstract class AddOn extends Food {
    public Food food;

    public AddOn(Food food) {
        this.food = food;
    }
}
