package org.example;

import java.awt.*;

public abstract class Vehicle {
    private String name;
    private Behavior behavior;

    public Vehicle(String name, Behavior behavior) {
        this.name = name;
        this.behavior = behavior;
    }
    public void getNotification(){
        System.out.println(name + " got notified");
    }

    public void takeAction(Color lightState){

        System.out.println("Vehicle type = " + this.getClass());
        behavior.printBehavior(lightState);
    }


}
