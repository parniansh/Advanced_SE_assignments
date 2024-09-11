package org.example;

import org.example.model.CargoShip;
import org.example.model.CruiseShip;
import org.example.model.Ship;

import java.lang.reflect.Array;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

//    Demonstrate the classes in a program that has a static array of Ship size of 3..
//    The array elements should be initiated dynamically with one type each of Ship,
//    CruiseShip, and CargoShip objects. Create a loop that iterates through the array calling each print function.
    public static void main(String[] args) {

        ArrayList<Ship> arrayOfShips = new ArrayList<Ship>();
        Ship ship = new Ship("ship", "2024");
        CruiseShip cruiseShip = new CruiseShip("cruise ship", "2023", 200);
        CargoShip cargoShip = new CargoShip("cargo ship", "2022",1000);
        arrayOfShips.add(ship);
        arrayOfShips.add(cruiseShip);
        arrayOfShips.add(cargoShip);
        for(int i=0; i< arrayOfShips.size(); i++){
            arrayOfShips.get(i).printShip();
        }


    }
}