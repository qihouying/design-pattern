package com.design.pattern.abstractFacotry.impl;

import com.design.pattern.abstractFacotry.Pizza;
import com.design.pattern.abstractFacotry.PizzaIngredientFactory;

/**
 * Created by dream on 08/04/2017.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClam();
    }
}
