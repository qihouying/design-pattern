package com.design.pattern.abstractFacotry.client;

import com.design.pattern.abstractFacotry.abstractProduct.Pizza;
import com.design.pattern.abstractFacotry.abstractFacory.PizzaIngredientFactory;
import com.design.pattern.abstractFacotry.PizzaStore;
import com.design.pattern.abstractFacotry.concreteFactory.NYPizzaIngredientFactory;
import com.design.pattern.abstractFacotry.concreteProduct.CheesePizza;
import com.design.pattern.abstractFacotry.concreteProduct.ClamPizza;

/** It is the client of the abstract factory
 *
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
