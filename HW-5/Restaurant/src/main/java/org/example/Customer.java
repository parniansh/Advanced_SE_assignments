package org.example;

import org.example.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String name;
    public  int orderPrice = 0;
    public final List<Food> order = new ArrayList<>();


    public Customer(String name) {
        this.name = name;
    }

    public List<Food> getOrder() {
        return order;
    }

    public void addToOrder(Food food) {
        order.add(food);
    }

    public int CalculateOrderPrice(){
        for(Food food : order){
            orderPrice = orderPrice + food.price();
        }
        return orderPrice;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", orderPrice=" + orderPrice +
                '}';
    }
}
