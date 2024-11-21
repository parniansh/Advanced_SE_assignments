package org.example;

import java.awt.*;

public class TrafficLight {

   private Color state;
   private final NotificationService notificationService;

   public TrafficLight(Color state) {
      this.state = state;
       notificationService = new NotificationService();
   }
   public Color transition(){
       if (this.state.equals(Color.GREEN)) {
           state = Color.YELLOW;
       } else if (this.state.equals(Color.YELLOW)) {
           state = Color.RED;
       } else if (this.state.equals(Color.RED)) {
           state = Color.GREEN;
       }
       return state;
   }

   public void colorChanged(){
      notificationService.notifyVehicle();
   }

   public NotificationService getNotificationService() {
      return notificationService;
   }

   public Color getState() {
      return state;
   }
}
