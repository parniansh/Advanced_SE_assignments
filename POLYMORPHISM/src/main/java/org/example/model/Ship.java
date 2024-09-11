package org.example.model;

public class Ship {


//    Design a Ship class that has the following members:
//            1.	A member variable for the name of the ship(String)
//2.	A member variable for the year that the ship was built(String)
//3.	Constructor with all setters and getters(Also known as accessors and mutators)
//4.	A print function that will display the ship name and year it was built.

    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName() {
        return name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void printShip(){
        System.out.println(String.format("Ship's name : %s, Year the ship was built: %s", name, yearBuilt));

    }
}
