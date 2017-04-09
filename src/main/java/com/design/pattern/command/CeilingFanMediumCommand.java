package com.design.pattern.command;

/**
 * Created by dream on 09/04/2017.
 */
public class CeilingFanMediumCommand extends CeilingFanBaseCommand {
    CeilingFan ceilingFan;
    int preSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        preSpeed = ceilingFan.getSpeed();

        ceilingFan.medium();
    }
}
