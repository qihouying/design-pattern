package com.design.pattern.command;

/**
 * Created by dream on 09/04/2017.
 */
public class CeilingFanHighCommand extends CeilingFanBaseCommand {
    CeilingFan ceilingFan;
    int preSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        preSpeed = ceilingFan.getSpeed();

        ceilingFan.high();
    }
}
