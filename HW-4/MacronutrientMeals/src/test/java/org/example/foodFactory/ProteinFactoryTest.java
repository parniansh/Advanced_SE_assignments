package org.example.foodFactory;

import org.example.foodProducts.Carb;
import org.example.foodProducts.Fat;
import org.example.foodProducts.Protein;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProteinFactoryTest {

    @Test
    public void createFoodTest(){
        ProteinFactory proteinFacTest =   ProteinFactory.getInstance();
        Protein protein = proteinFacTest.createFood();
        assertNotNull(protein);
    }

    @Test
    public void createTofuTest(){
        Protein protein = ProteinFactory.getInstance().createTofu();
        assertEquals("Tofu", protein.getName());
    }

    @Test
    public void getInstanceTest(){
        assertNotNull(ProteinFactory.getInstance());
    }
}
