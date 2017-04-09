package com.design.pattern.abstractFacotry.abstractFacory;

import com.design.pattern.abstractFacotry.Cheese;
import com.design.pattern.abstractFacotry.Clams;
import com.design.pattern.abstractFacotry.Dough;
import com.design.pattern.abstractFacotry.Sauce;

/**
 * abstract factory
 * Created by dream on 08/04/2017.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClam();

}
