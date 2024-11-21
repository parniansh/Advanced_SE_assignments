package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private final List<TrafficlightListener> vehicles;
    public NotificationService() {
        this.vehicles = new ArrayList<>();
    }
    public void subscribe(TrafficlightListener listener){
        vehicles.add(listener);
    }
    public void unsubscribe(TrafficlightListener listener){
        vehicles.remove(vehicles);
    }

    public void notifyVehicle(){
        vehicles.forEach(TrafficlightListener::update);
    }
}
