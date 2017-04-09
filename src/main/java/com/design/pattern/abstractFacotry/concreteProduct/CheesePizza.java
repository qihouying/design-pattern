package com.design.pattern.abstractFacotry.concreteProduct;

import com.design.pattern.abstractFacotry.abstractProduct.Pizza;
import com.design.pattern.abstractFacotry.abstractFacory.PizzaIngredientFactory;

/**
 * Created by dream on 08/04/2017.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    /**
     * a pizza has different ingredients
     */
    public void prepare() {
        System.out.println("preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
