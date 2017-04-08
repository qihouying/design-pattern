package com.design.pattern.abstractFacotry;

/**
 * Created by dream on 08/04/2017.
 */
public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;
    public Clams clams;

    public abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza int diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", clams=" + clams +
                '}';
    }
}
