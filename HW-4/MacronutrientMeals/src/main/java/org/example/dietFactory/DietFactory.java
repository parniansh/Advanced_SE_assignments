package org.example.dietFactory;

import org.example.foodFactory.ProteinFactory;

import java.util.List;

public abstract class DietFactory {
    private static DietFactory dietFactory;

    protected DietFactory() {
    }

    public List<String> generateDiet(){return null;};

    public static DietFactory getInstance(){

        if(dietFactory == null){dietFactory = new DietFactory() {
        };}
        return dietFactory;
    }
}
