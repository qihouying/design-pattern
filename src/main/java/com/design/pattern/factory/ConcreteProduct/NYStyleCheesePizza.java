package com.design.pattern.factory.ConcreteProduct;

import com.design.pattern.factory.Pizza;

/**
 * Created by dream on 08/04/2017.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grate Reggiano Cheese");
    }
}
