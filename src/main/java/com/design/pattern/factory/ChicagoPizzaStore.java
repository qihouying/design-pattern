package com.design.pattern.factory;

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
