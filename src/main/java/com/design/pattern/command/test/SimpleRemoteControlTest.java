package com.design.pattern.command.test;

import com.design.pattern.command.Light;
import com.design.pattern.command.SimpleRemoteControl;
import com.design.pattern.command.impl.LightOnCommand;

/**
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
