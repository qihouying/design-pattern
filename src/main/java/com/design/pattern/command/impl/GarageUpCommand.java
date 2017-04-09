package com.design.pattern.command.impl;

import com.design.pattern.command.CeilingFan;
import com.design.pattern.command.Command;
import com.design.pattern.command.GarageDoor;

/**
 * Created by dream on 09/04/2017.
 */
public class GarageUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();

    }

    public void undo() {
        garageDoor.down();
    }
}
