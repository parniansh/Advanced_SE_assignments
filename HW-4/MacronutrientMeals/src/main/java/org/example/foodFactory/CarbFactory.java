package org.example.foodFactory;

import org.example.foodProducts.Carb;
import org.example.foodProducts.Food;

public class CarbFactory extends FoodFactory {
    private static CarbFactory carbFactory;

    private CarbFactory() {
        super();
    }

    @Override
    public Carb createFood() {
        getRandomNumber();
        return new Carb(getRandomNumber());
    }

    public Carb createPistachio(){
        return new Carb("Pistachio");
    }

    public static CarbFactory getInstance(){

        if(carbFactory == null){carbFactory = new CarbFactory();}
        return carbFactory;
    }
}
