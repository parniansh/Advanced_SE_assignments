package org.example.dietFactory;

import org.example.foodProducts.Carb;
import org.example.foodProducts.Fat;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VeganDietTest {

    VeganDiet veganDiet = VeganDiet.getInstance();

    @Test
    public void generateDietTest() {

        List<String> dietPlan = veganDiet.generateDiet();

        assertNotNull(dietPlan);
        assertEquals(3, dietPlan.size());
        assertNotNull(dietPlan.get(0));
        assertNotNull(dietPlan.get(1));
        assertNotNull(dietPlan.get(2));
    }

    @Test
    public void createCarbTest(){
        Carb carb = veganDiet.createCarb();
        assertNotNull(carb);
        assertNotSame("Cheese", carb.getName());
    }

    @Test
    public void createFatTest(){
        Fat fat = veganDiet.createFat();
        assertNotNull(fat);
        assertNotSame("Tuna", fat.getName());
        assertNotSame("Sour cream", fat.getName());
    }


    @Test
    public void getInstanceTest(){
        assertNotNull(veganDiet);
    }
}
