package org.example.foodFactory;

import org.example.foodProducts.Carb;
import org.example.foodProducts.Protein;

public class ProteinFactory extends FoodFactory{
    private static ProteinFactory proteinFactory;

    private ProteinFactory() {
        super();
    }

    @Override
    public Protein createFood() {
        super.getRandomNumber();
        return new Protein(getRandomNumber());
    }

    public Protein createTofu(){
        return new Protein("Tofu");
    }

    public static ProteinFactory getInstance(){

        if(proteinFactory == null){proteinFactory = new ProteinFactory();}
        return proteinFactory;
    }
}
