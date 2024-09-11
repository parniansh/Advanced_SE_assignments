package org.example.model;

public class CruiseShip extends Ship {

    //    Design a CruiseShip class that is derived from the Ship class and has the following members:
//            1.	A member variable for the maximum number of passengers(Int)
//2.	Constructor with all setters and getters(Also known as accessors and mutators)
//3.	A print function that overrides the base print function and will display the ship name and maximum number of passengers.

    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void printShip(){
        System.out.println(String.format("Ship's name : %s, Maximum number of passengers: %d", getName(), maxPassengers));

    }
}
