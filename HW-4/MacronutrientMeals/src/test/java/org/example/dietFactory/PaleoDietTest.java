package org.example.dietFactory;

import org.example.foodProducts.Carb;
import org.example.foodProducts.Fat;
import org.example.foodProducts.Protein;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PaleoDietTest {

    PaleoDiet paleoDiet = PaleoDiet.getInstance();

    @Test
    public void generateDietTest() {

        List<String> dietPlan = paleoDiet.generateDiet();

        assertNotNull(dietPlan);
        assertEquals(3, dietPlan.size());
        assertNotNull(dietPlan.get(0));
        assertNotNull(dietPlan.get(1));
        assertNotNull(dietPlan.get(2));
    }

    @Test
    public void createFatTest(){
        Fat fat = paleoDiet.createFat();
        assertNotNull(fat);
        assertNotSame("Peanuts", fat.getName());
    }

    @Test
    public void createProteinTest(){
        Protein protein = paleoDiet.createProtein();
        assertNotNull(protein);
        assertNotSame("Tofu", protein.getName());
    }
    @Test
    public void getInstanceTest(){
        assertNotNull(paleoDiet);
    }
}
