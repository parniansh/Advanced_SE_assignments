package org.example.dietFactory;

import org.example.foodProducts.Carb;
import org.example.foodProducts.Fat;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NutAllergyDietTest {

    NutAllergyDiet nutAllergyDiet = NutAllergyDiet.getInstance();

    @Test
    public void generateDietTest() {
        List<String> dietPlan = nutAllergyDiet.generateDiet();

        assertNotNull(dietPlan);
        assertEquals(3, dietPlan.size());
        assertNotNull(dietPlan.get(0));
        assertNotNull(dietPlan.get(1));
        assertNotNull(dietPlan.get(2));
    }

    @Test
    public void createFatTest(){
        Fat fat = nutAllergyDiet.createFat();
        assertNotNull(fat);
        assertNotSame("Peanuts", fat.getName());
    }

    @Test
    public void createCarbTest(){
        Carb carb = nutAllergyDiet.createCarb();
        assertNotNull(carb);
        assertNotSame("Pistachio", carb.getName());
    }

    @Test
    public void getInstanceTest(){
        assertNotNull(nutAllergyDiet);
    }
}
