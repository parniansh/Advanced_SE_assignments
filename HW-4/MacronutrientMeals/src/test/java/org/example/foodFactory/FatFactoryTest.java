package org.example.foodFactory;

import org.example.foodProducts.Carb;
import org.example.foodProducts.Fat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FatFactoryTest {

    @Test
    public void createFoodTest(){
        FatFactory fatFacTest =   FatFactory.getInstance();
        Fat fat = fatFacTest.createFood();
        assertNotNull(fat);
    }

    @Test
    public void getInstanceTest(){
        FatFactory fatFactory = FatFactory.getInstance();
        assertNotNull(fatFactory);
    }
}
