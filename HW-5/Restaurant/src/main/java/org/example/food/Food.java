package org.example.food;

public abstract class Food {
    public String name;
    public String description;

    public Food() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int price() {
        return 0;
    }
}
