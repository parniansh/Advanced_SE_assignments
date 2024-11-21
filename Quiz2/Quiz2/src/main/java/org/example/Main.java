package org.example;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(Color.GREEN);
        Car car = new Car("car1", new Aggressive());
        TrafficlightListener trafficlightListener = new TrafficlightListener(car);
        trafficLight.getNotificationService().subscribe(trafficlightListener);
        trafficLight.getNotificationService().notifyVehicle();
        car.takeAction(Color.RED);

    }
}