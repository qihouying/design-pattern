package com.design.pattern.command.invoker;

import com.design.pattern.command.Command;

/**
 * Created by dream on 09/04/2017.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
