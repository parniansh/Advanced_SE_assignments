package org.example.dietFactory;

import org.example.foodFactory.CarbFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NoRestrictionDietTest {

    NoRestrictionDiet noRestrictionDiet = NoRestrictionDiet.getInstance();
    @Test
    public void generateDietTest() {

        List<String> dietPlan = noRestrictionDiet.generateDiet();

        assertNotNull(dietPlan);
        assertEquals(3, dietPlan.size());
        assertNotNull(dietPlan.get(0));
        assertNotNull(dietPlan.get(1));
        assertNotNull(dietPlan.get(2));
    }

    @Test
    public void getInstanceTest(){
        assertNotNull(noRestrictionDiet);
    }
}
