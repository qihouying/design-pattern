package com.design.pattern.abstractFacotry;


import com.design.pattern.abstractFacotry.impl.NYPizzaStore;

/**
 * Created by dream on 08/04/2017.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");


    }
}
