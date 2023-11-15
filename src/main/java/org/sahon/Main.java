package org.sahon;

import org.sahon.dto.*;

public class Main {
    public static void main(String[] args) {
        RestaurantManagementSystem restaurantManagementSystem = new RestaurantManagementSystem();
        Dish frenchFries = new Dish("French Fries", 245.99, FoodType.VEGE);
        Beverage appleJuice = new Beverage("Apple Juice", 0.01, true);
        Combo frenchJuice = new Combo("French Juice");

        frenchJuice.addDish(frenchFries);
        frenchJuice.addBeverage(appleJuice);

        restaurantManagementSystem.addCombo(frenchJuice);

        System.out.println(restaurantManagementSystem);
    }
}