package com.design.pattern.factory.concreteCreator;

import com.design.pattern.factory.ConcreteProduct.NYStyleCheesePizza;
import com.design.pattern.factory.ConcreteProduct.NYStyleVeggiePizza;
import com.design.pattern.factory.Pizza;
import com.design.pattern.factory.PizzaStore;

/**
 * Created by dream on 08/04/2017.
 */
public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
