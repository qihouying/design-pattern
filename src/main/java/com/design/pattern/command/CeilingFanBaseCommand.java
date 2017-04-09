package com.design.pattern.command;

/**
 * Created by dream on 09/04/2017.
 */
public class CeilingFanBaseCommand implements Command {
    CeilingFan ceilingFan;
    int preSpeed;

    public void execute() {
    }

    public void undo() {
        if (preSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (preSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (preSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (preSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
