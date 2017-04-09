package com.design.pattern.command;

/**
 * Created by dream on 09/04/2017.
 */
public class Stereo {
    private String name;

    public Stereo(String name) {
        this.name = name;
    }
    public Stereo() {
        this.name = "";
    }

    public void on() {
        System.out.println(name + " stereo is on");
    }

    public void off() {
        System.out.println(name + " stereo is off");
    }

    public void setCD() {
        System.out.println(name + " stereo is set for CD input");
    }

    public void setDvd() {
        System.out.println(name + " stereo is set for Dvd input");
    }

    public void setRadio() {
        System.out.println(name + " stereo is set for radio input");
    }

    public void setVolume(int level) {
        System.out.println(name + " stereo volume set to " + level);
    }

}
