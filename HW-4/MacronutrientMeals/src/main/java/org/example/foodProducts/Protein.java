package org.example.foodProducts;

import java.util.List;

public class Protein extends Food{

    private final List<String> options = List.of("Fish","Chicken","Beef","Tofu");

    private final String name;


    public Protein(int randomNumber) {
        super();
        this.name = this.options.get(randomNumber);
    }

    public Protein(String name) {
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
