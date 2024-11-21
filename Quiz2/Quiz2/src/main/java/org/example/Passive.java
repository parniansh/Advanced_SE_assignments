package org.example;

import java.awt.*;

public class Passive implements Behavior{
    @Override
    public void printBehavior(Color trafficLightState) {
        if (trafficLightState.equals(Color.GREEN)) {
            System.out.println("Go Slow");
        } else if (trafficLightState.equals(Color.YELLOW)) {
            System.out.println("Slower");
        } else if (trafficLightState.equals(Color.RED)) {
            System.out.println("Stop");
        }
    }
}
