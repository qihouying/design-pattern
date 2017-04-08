package com.design.pattern.abstractFacotry.impl;

import com.design.pattern.abstractFacotry.Pizza;
import com.design.pattern.abstractFacotry.PizzaIngredientFactory;
import com.design.pattern.abstractFacotry.PizzaStore;

/**
 * Created by dream on 08/04/2017.
 */
public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {

            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (type.equals("clam")) {

            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
