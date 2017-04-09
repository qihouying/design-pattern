package com.design.pattern.command.impl;

import com.design.pattern.command.CeilingFan;

/**
 * Created by dream on 09/04/2017.
 */
public class CeilingFanOffCommand extends CeilingFanBaseCommand {

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        preSpeed = ceilingFan.getSpeed();

        ceilingFan.off();
    }
}
