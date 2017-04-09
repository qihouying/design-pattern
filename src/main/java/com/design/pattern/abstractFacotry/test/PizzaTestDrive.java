package com.design.pattern.abstractFacotry.test;


import com.design.pattern.abstractFacotry.abstractProduct.Pizza;
import com.design.pattern.abstractFacotry.PizzaStore;
import com.design.pattern.abstractFacotry.client.NYPizzaStore;

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
