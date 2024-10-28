package org.example.dietFactory;

import org.example.foodFactory.CarbFactory;
import org.example.foodFactory.FatFactory;
import org.example.foodFactory.ProteinFactory;
import org.example.foodProducts.Carb;
import org.example.foodProducts.Fat;
import org.example.foodProducts.Protein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VeganDiet extends  DietFactory{

    private static VeganDiet veganDiet;
    private final List<String> dietPlan= new ArrayList<>();
    final List<String> excludedFat = Arrays.asList("Tuna", "Sour cream");
    final String excludedCarb = "Cheese";


    private VeganDiet() {
        super();
    }

    @Override
    public List<String> generateDiet() {

        dietPlan.add(createCarb().getName());
        dietPlan.add(createFat().getName());
        dietPlan.add(ProteinFactory.getInstance().createTofu().getName());
        return dietPlan;
    }


    public Carb createCarb(){
        Carb carb;
        do {
            carb = CarbFactory.getInstance().createFood();
        } while (carb.getName().equals(excludedCarb));

        return carb;
    }

    public Fat createFat(){
        Fat fat;
        do {
            fat = FatFactory.getInstance().createFood();
        } while (excludedFat.contains(fat.getName()));

        return fat;
    }



    public static VeganDiet getInstance(){

        if(veganDiet == null){veganDiet = new VeganDiet();}
        veganDiet.dietPlan.clear();
        return veganDiet;
    }


}
