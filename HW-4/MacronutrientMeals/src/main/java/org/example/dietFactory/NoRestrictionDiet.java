package org.example.dietFactory;

import org.example.foodFactory.CarbFactory;
import org.example.foodFactory.FatFactory;
import org.example.foodFactory.ProteinFactory;
import org.example.foodProducts.Carb;
import org.example.foodProducts.Fat;
import org.example.foodProducts.Protein;

import java.util.ArrayList;
import java.util.List;

public class NoRestrictionDiet extends DietFactory{
    private final List<String> dietPlan= new ArrayList<>();
    private static NoRestrictionDiet noRestrictionDiet;

    private NoRestrictionDiet() {
        super();
    }

    @Override
    public List<String> generateDiet() {

        dietPlan.add(CarbFactory.getInstance().createFood().getName());
        dietPlan.add(FatFactory.getInstance().createFood().getName());
        dietPlan.add(ProteinFactory.getInstance().createFood().getName());
        return dietPlan;
    }

    public static NoRestrictionDiet getInstance(){

        if(noRestrictionDiet == null){noRestrictionDiet = new NoRestrictionDiet();}
        noRestrictionDiet.dietPlan.clear();
        return noRestrictionDiet;
    }


}
