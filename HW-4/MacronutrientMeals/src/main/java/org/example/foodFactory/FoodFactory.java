package org.example.foodFactory;

import org.example.foodProducts.Food;

import java.util.Random;

abstract class FoodFactory {
    private static FoodFactory foodFactory;

   protected FoodFactory() {
    }

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(4);
    }

    public Food createFood(){return null;}
    protected static FoodFactory createInstance(){return null;}

    public static FoodFactory getInstance(){

       if(foodFactory == null){foodFactory = createInstance();}
       return foodFactory;
    }

}
