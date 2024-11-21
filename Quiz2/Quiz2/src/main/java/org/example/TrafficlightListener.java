package org.example;

public class TrafficlightListener {
    private final Vehicle vehicle;


    public TrafficlightListener(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void update(){
        vehicle.getNotification();
    }
}
