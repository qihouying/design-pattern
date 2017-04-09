package com.design.pattern.factory.concreteCreator;

import com.design.pattern.factory.ConcreteProduct.ChicagoStyleCheesePizza;
import com.design.pattern.factory.ConcreteProduct.ChicagoStyleVeggiePizza;
import com.design.pattern.factory.Pizza;
import com.design.pattern.factory.PizzaStore;

/**
 * Created by dream on 08/04/2017.
 */
public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
