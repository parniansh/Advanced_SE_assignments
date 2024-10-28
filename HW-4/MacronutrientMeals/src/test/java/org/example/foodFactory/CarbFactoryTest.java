package org.example.foodFactory;

import org.example.foodProducts.Carb;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarbFactoryTest {

    @Test
    public void createFoodTest(){
        CarbFactory carbFacTest =   CarbFactory.getInstance();
        Carb carb = carbFacTest.createFood();
        assertNotNull(carb);
    }

    @Test
    public void createPistachioTest(){
        Carb carb = CarbFactory.getInstance().createPistachio();
        assertEquals("Pistachio", carb.getName());
    }

    @Test
    public void getInstanceTest(){
        CarbFactory carbFactory = CarbFactory.getInstance();
        assertNotNull(carbFactory);
    }

}
