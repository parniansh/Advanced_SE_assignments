package org.example;


import java.util.Map;

public class Loyalty {

    private static final Map<String, Integer> loyaltyDiscounts = Map.of(
            "New", 0,
            "Bronze", 5,
            "Silver", 10,
            "Gold", 15,
            "Platinum", 20,
            "VIP", 25
    );
    public static double applyDiscount(int price, String status) {

        int discountPercentage = loyaltyDiscounts.getOrDefault(status, 0);
        double discountAmount = price * (discountPercentage / 100.0);
        return price - discountAmount;
    }


}
