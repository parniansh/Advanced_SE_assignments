package org.example;

import org.example.dietFactory.NoRestrictionDiet;
import org.example.dietFactory.NutAllergyDiet;
import org.example.dietFactory.PaleoDiet;
import org.example.dietFactory.VeganDiet;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    public String name;
    public DietPlan diet;
    public List<String> meal = new ArrayList<>();

    public Customer(String name, DietPlan diet) {
        this.name = name;
        this.diet = diet;
        createDietPlan();
    }

    public List<String> createDietPlan(){

        switch(this.diet) {
            case NoRestriction:
                meal = NoRestrictionDiet.getInstance().generateDiet();
                break;
            case Paleo:
                meal = PaleoDiet.getInstance().generateDiet();
                break;
            case Vegan:
                meal = VeganDiet.getInstance().generateDiet();;
                break;
            case NutAllergy:
                meal = NutAllergyDiet.getInstance().generateDiet();
                break;

        }

        return meal;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", meal=" + meal +
                ", diet=" + diet +
                '}';
    }
}
