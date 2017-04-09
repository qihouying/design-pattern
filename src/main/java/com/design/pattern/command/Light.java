package com.design.pattern.command;

/**
 * Created by dream on 09/04/2017.
 */
public class Light {
    public String name;

    public Light(String name) {
        this.name = name;
    }
    public Light() {
        this.name = "";
    }
    public void on() {
        System.out.println(name + " light is on");
    }

    public void off() {
        System.out.println(name + " light is off");
    }

}
