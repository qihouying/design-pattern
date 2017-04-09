package com.design.pattern.abstractFacotry;

import com.design.pattern.abstractFacotry.abstractProduct.Pizza;

/**
 * Created by dream on 08/04/2017.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
