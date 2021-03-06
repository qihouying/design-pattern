package com.design.pattern.command.concreteCommand;

import com.design.pattern.command.receiver.CeilingFan;

/**
 * Created by dream on 09/04/2017.
 */
public class CeilingFanHighCommand extends CeilingFanBaseCommand {

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        preSpeed = ceilingFan.getSpeed();

        ceilingFan.high();
    }
}
