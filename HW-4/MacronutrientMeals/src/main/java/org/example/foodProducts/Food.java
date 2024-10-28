package org.example.foodProducts;

public abstract class Food {
    private String[] options;
    private String name;


    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
