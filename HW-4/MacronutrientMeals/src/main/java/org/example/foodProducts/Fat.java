package org.example.foodProducts;

public class Fat extends Food {

    private final String[] options = {"Avocado","Sour cream","Tuna","Peanuts"};
    private final String name;


    public Fat(int randomNumber) {
        super();
        this.name = this.options[randomNumber];
    }

    public String getName() {
        return name;
    }
}
