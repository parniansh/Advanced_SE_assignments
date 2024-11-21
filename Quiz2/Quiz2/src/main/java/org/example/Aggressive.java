package org.example;

import java.awt.*;

public class Aggressive implements Behavior {
    @Override
    public void printBehavior(Color trafficLightState) {
        if (trafficLightState.equals(Color.GREEN)) {
            System.out.println("Need4Speed");
        } else if (trafficLightState.equals(Color.YELLOW)) {
            System.out.println("Faster");
        } else if (trafficLightState.equals(Color.RED)) {
            System.out.println("Slam Brake");
        }
    }
}
