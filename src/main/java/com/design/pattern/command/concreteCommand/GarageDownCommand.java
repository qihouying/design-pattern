package com.design.pattern.command.concreteCommand;

import com.design.pattern.command.Command;
import com.design.pattern.command.receiver.GarageDoor;

/**
 * Created by dream on 09/04/2017.
 */
public class GarageDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();

    }

    public void undo() {
        garageDoor.up();
    }
}
