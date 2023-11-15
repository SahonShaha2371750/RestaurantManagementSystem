package org.sahon.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Setter
@Getter
public class Beverage {
    private static int nextID = 1;
    private String id;
    private String name;
    private double price;
    private boolean containsAlcohol;

    public Beverage(String name, double price, boolean containsAlcohol) {
        this.id = String.format("B%03d", nextID++);
        this.name = name;
        this.price = price;
        this.containsAlcohol = containsAlcohol;
    }
}
