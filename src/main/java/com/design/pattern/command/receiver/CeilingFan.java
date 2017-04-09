package com.design.pattern.command.receiver;

/**
 * Created by dream on 09/04/2017.
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }
    public CeilingFan() {
        this.location = "";
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " ceiling fan is off");
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " current speed is on high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " current speed is on medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " current speed is on low");
    }

    public int getSpeed() {
        System.out.println(location + " current speed is " + speed);
        return speed;
    }
}
