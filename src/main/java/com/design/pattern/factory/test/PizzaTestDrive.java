package com.design.pattern.factory.test;

import com.design.pattern.factory.concreteCreator.ChicagoPizzaStore;
import com.design.pattern.factory.concreteCreator.NYPizzaStore;
import com.design.pattern.factory.Pizza;
import com.design.pattern.factory.PizzaStore;

/**
 * Created by dream on 08/04/2017.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
