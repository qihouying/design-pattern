package com.design.pattern.abstractFacotry.concreteFactory;

import com.design.pattern.abstractFacotry.*;
import com.design.pattern.abstractFacotry.abstractFacory.PizzaIngredientFactory;
import com.design.pattern.abstractFacotry.impl.FreshClams;
import com.design.pattern.abstractFacotry.impl.MarinaraSauce;
import com.design.pattern.abstractFacotry.impl.RegginaoCheese;
import com.design.pattern.abstractFacotry.impl.ThickCrustDough;

/** concrete factory1, each factory has different implements
 *
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
