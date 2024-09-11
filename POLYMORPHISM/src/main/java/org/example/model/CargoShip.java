package org.example.model;

public class CargoShip extends Ship{

//    Design a CargoShip class that is derived from the Ship class and has the following members:
//            1.	A member variable for the cargo capacity in tonnage(Int)
//2.	Constructor with all setters and getters(Also known as accessors and mutators)
//3.	A print function that overrides the base print function and will display the ship name and ships cargo capacity.
    private int capacity;
    public CargoShip(String name, String yearBuilt, int capacity) {
        super(name, yearBuilt);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void printShip(){
        System.out.println(String.format("Ship's name : %s, Ship's capacity: %d", getName(), capacity));

    }
}
