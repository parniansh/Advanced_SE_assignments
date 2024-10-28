package org.example;

import org.example.dietFactory.NoRestrictionDiet;
import org.example.dietFactory.NutAllergyDiet;
import org.example.dietFactory.PaleoDiet;
import org.example.dietFactory.VeganDiet;
import org.example.foodFactory.CarbFactory;
import org.example.foodProducts.Carb;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("customer1", DietPlan.NoRestriction);
        System.out.println(c1.toString());

        Customer c2 = new Customer("customer2", DietPlan.Paleo);
        System.out.println(c2.toString());

        Customer c3 = new Customer("customer3", DietPlan.Vegan);
        System.out.println(c3.toString());

        Customer c4 = new Customer("customer4", DietPlan.NutAllergy);
        System.out.println(c4.toString());

        Customer c5 = new Customer("customer5", DietPlan.NoRestriction);
        System.out.println(c5.toString());

        Customer c6 = new Customer("customer6", DietPlan.Vegan);
        System.out.println(c6.toString());


    }
}