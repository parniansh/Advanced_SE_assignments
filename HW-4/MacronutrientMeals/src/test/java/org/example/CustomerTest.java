package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CustomerTest {

    @Test
    public void createDietPlanTest(){
        Customer customer = new Customer("name", DietPlan.NoRestriction);
        List<String> meal = customer.createDietPlan();
        assertNotNull(meal);

    }
}
