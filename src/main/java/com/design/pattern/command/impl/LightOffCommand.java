package com.design.pattern.command.impl;

import com.design.pattern.command.Command;
import com.design.pattern.command.Light;

/**
 * Created by dream on 09/04/2017.
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
