package org.example.foodProducts;

import java.util.List;

public class Carb extends Food {

    private final List<String> options = List.of("Cheese", "Bread", "Lentils", "Pistachio");
    private final String name;


    public Carb(int randomNumber) {
        super();
        this.name = this.options.get(randomNumber);
    }

    public Carb(String name) {
       if(this.options.contains(name)) {
           this.name = name;
       }else{
           this.name = "";
       }
    }

    public String getName() {
        return name;
    }



}
