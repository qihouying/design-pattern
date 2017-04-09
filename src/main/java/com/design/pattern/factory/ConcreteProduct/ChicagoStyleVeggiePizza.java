package com.design.pattern.factory.ConcreteProduct;

import com.design.pattern.factory.Pizza;

/**
 * Created by dream on 08/04/2017.
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grate Reggiano Veggie");
    }
}
