package com.design.pattern.command;

/**
 * Created by dream on 09/04/2017.
 */
public class CeilingFanLowCommand extends CeilingFanBaseCommand {
    CeilingFan ceilingFan;
    int preSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        preSpeed = ceilingFan.getSpeed();

        ceilingFan.low();
    }
}
