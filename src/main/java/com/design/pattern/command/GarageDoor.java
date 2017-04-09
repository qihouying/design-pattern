package com.design.pattern.command;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月09 10:13.
 */
public class GarageDoor {
    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name + " garage door is up");
    }
    public void down() {
        System.out.println(name + " garage door is down");
    }
    public void stop() {
        System.out.println(name + " garage door is stop");
    }

    public void lightOn() {
        System.out.println(name + " garage door light is on");
    }

    public void lightOff() {
        System.out.println(name + " garage door light is off");
    }

}
