package com.design.pattern.abstractFacotry.impl;

import com.design.pattern.abstractFacotry.*;

/**
 * Created by dream on 08/04/2017.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new RegginaoCheese();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
