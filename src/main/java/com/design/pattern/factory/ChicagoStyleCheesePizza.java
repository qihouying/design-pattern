package com.design.pattern.factory;

/**
 * Created by dream on 08/04/2017.
 */
public class ChicagoStyleCheesePizza  extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza int square slices");
    }
}
