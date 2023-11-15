package org.sahon.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Combo {
    private static final int MAX_DISH_NUM = 2;
    private static int nextID = 1;

    private String id;
    private String name;
    private double price;
    private Dish[] dishes = new Dish[2]; // same as this.dishes = new Dish[2];
    private Beverage[] beverages;

    public Combo(String name) {
        this.id = String.format("C%03d", nextID++);
        this.name = name;
        this.beverages = new Beverage[2];
    }

    public void addDish(Dish dish) {
        if (dishes[0] == null) {
            dishes[0] = dish;
            calcPrice();
        }
        else if (dishes[1] == null) {
            dishes[1] = dish;
            calcPrice();
        }
        else {
            System.out.printf("There are already %d dishes. No more dishes added.", MAX_DISH_NUM);
        }
    }
    public void addBeverage(Beverage beverage) {
        if (beverages[0] == null) {
            beverages[0] = beverage;
            calcPrice();
        }
        else if (beverages[1] == null) {
            beverages[1] = beverage;
            calcPrice();
        }
        else {
            System.out.printf("There are already %d beverages. No more beverages added.", MAX_DISH_NUM);
        }
    }

    public void calcPrice() {
        double price = 0;

        for (Beverage beverage : beverages) {
            if (beverage != null) {
                price += beverage.getPrice();
            }
        }

        for (Dish dish : dishes) {
            if (dish != null) {
                price += dish.getPrice();
            }
        }

        double discountRatio = 0.8;
        this.price = price * discountRatio;
    }
}
