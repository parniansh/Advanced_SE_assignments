package org.example.dietFactory;

import org.example.foodFactory.CarbFactory;
import org.example.foodFactory.FatFactory;
import org.example.foodFactory.ProteinFactory;
import org.example.foodProducts.Carb;
import org.example.foodProducts.Fat;
import org.example.foodProducts.Protein;

import java.util.ArrayList;
import java.util.List;

public class PaleoDiet extends DietFactory{

    private final List<String> dietPlan= new ArrayList<>();
    private static PaleoDiet paleoDiet;

    private PaleoDiet() {
        super();
    }

    @Override
    public List<String> generateDiet() {
        dietPlan.add(CarbFactory.getInstance().createPistachio().getName());
        dietPlan.add(createFat().getName());
        dietPlan.add(createProtein().getName());
        return dietPlan;
    }

    public Fat createFat(){
        final String excludedFat = "Sour cream";
        Fat fat = FatFactory.getInstance().createFood();
        while(fat.getName().equals(excludedFat)){
            fat = FatFactory.getInstance().createFood();
        }
        return fat;
    }

    public Protein createProtein(){

        final String excludedProtein = "Tofu";

        Protein protein = ProteinFactory.getInstance().createFood();
        while(protein.getName().equals(excludedProtein)){
            protein = ProteinFactory.getInstance().createFood();
        }

        return protein;
    }

    public static PaleoDiet getInstance(){

        if(paleoDiet == null){paleoDiet = new PaleoDiet();}
        paleoDiet.dietPlan.clear();
        return paleoDiet;
    }


}
