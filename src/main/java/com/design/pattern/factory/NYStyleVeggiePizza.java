package com.design.pattern.factory;

/**
 * Created by dream on 08/04/2017.
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grate Reggiano Veggie");
    }
}
