package org.example;

import java.awt.*;

public class Normal implements Behavior{
    @Override
    public void printBehavior(Color trafficLightState ) {
        if (trafficLightState.equals(Color.GREEN)) {
            System.out.println("Go");
        } else if (trafficLightState.equals(Color.YELLOW)) {
            System.out.println("Slow");
        } else if (trafficLightState.equals(Color.RED)) {
            System.out.println("Stop");
        }
    }
}
