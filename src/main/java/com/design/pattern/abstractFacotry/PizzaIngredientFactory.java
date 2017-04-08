package com.design.pattern.abstractFacotry;

/**
 * Created by dream on 08/04/2017.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClam();

}
