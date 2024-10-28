package org.example.dietFactory;

import org.example.foodFactory.CarbFactory;
import org.example.foodFactory.FatFactory;
import org.example.foodFactory.ProteinFactory;
import org.example.foodProducts.Carb;
import org.example.foodProducts.Fat;
import org.example.foodProducts.Protein;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class NutAllergyDiet extends DietFactory{



    private final List<String> dietPlan= new ArrayList<>();
    private static NutAllergyDiet nutAllergyDiet;

    private NutAllergyDiet() {
        super();
    }

    @Override
    public List<String> generateDiet() {

        dietPlan.add(createCarb().getName());
        dietPlan.add(ProteinFactory.getInstance().createFood().getName());
        dietPlan.add(createFat().getName());
        return dietPlan;
    }

    public Fat createFat(){
        final String excludedFat = "Peanuts";
        Fat fat;
        do {
            fat = FatFactory.getInstance().createFood();
        } while (excludedFat.contains(fat.getName()));

        return fat;
    }

    public Carb createCarb(){
        final String excludedCarb = "Pistachio";
        Carb carb;
        do {
            carb = CarbFactory.getInstance().createFood();
        } while (carb.getName().equals(excludedCarb));

        return carb;
    }

    public static NutAllergyDiet getInstance(){

        if(nutAllergyDiet == null){nutAllergyDiet = new NutAllergyDiet();}
        nutAllergyDiet.dietPlan.clear();
        return nutAllergyDiet;
    }

}
