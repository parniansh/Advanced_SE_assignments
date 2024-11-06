package org.example.food;

public class HotDog extends Food{
    public HotDog() {
        this.name = "Hot Dog";
    }

    @Override
    public int price() {
        return 5;
    }
}
