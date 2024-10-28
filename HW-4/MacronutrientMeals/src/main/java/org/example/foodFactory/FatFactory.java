package org.example.foodFactory;

import org.example.foodProducts.Carb;
import org.example.foodProducts.Fat;

public class FatFactory extends FoodFactory{

    private static FatFactory fatFactory;
    private FatFactory() {
        super();
    }

    @Override
    public Fat createFood() {
        super.getRandomNumber();
        return new Fat(getRandomNumber());
    }

    public static FatFactory getInstance(){

        if(fatFactory == null){fatFactory = new FatFactory();}
        return fatFactory;
    }
}
