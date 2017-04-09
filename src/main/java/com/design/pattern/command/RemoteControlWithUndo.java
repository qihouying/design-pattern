package com.design.pattern.command;

import com.design.pattern.command.impl.NoCommand;
import com.design.pattern.utils.Constants;

import java.util.Arrays;

/**
 * Created by dream on 09/04/2017.
 */
public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[Constants.COMMANDS_COUNT];
        offCommands = new Command[Constants.COMMANDS_COUNT];

        Command noCommand = new NoCommand();

        for (int i = 0; i < Constants.COMMANDS_COUNT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();

        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();

        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n-------------------Remote Control-----------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "  "
                    + offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
