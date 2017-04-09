package com.design.pattern.command.invoker;

import com.design.pattern.command.Command;
import com.design.pattern.command.concreteCommand.NoCommand;
import com.design.pattern.utils.Constants;

/** invoker: execute the request by calling command object, the related method is called action method
 *
 * Created by dream on 09/04/2017.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[Constants.COMMANDS_COUNT];
        offCommands = new Command[Constants.COMMANDS_COUNT];

        Command noCommand = new NoCommand();

        for (int i = 0; i < Constants.COMMANDS_COUNT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
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
