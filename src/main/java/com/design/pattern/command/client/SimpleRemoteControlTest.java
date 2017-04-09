package com.design.pattern.command.client;

import com.design.pattern.command.receiver.Light;
import com.design.pattern.command.invoker.SimpleRemoteControl;
import com.design.pattern.command.concreteCommand.LightOnCommand;

/**
 * Desc: create a concreteCommand and specify the receiver
 *
 * Created by dream on 09/04/2017.
 */
public class SimpleRemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
