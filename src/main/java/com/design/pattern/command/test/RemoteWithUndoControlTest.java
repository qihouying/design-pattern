package com.design.pattern.command.test;

import com.design.pattern.command.Light;
import com.design.pattern.command.RemoteControlWithUndo;
import com.design.pattern.command.impl.LightOffCommand;
import com.design.pattern.command.impl.LightOnCommand;

/**
 * Created by dream on 09/04/2017.
 */
public class RemoteWithUndoControlTest {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        System.out.println(remoteControl.toString());

        remoteControl.undoButtonWasPressed();
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(0);

        System.out.println(remoteControl.toString());

        remoteControl.undoButtonWasPressed();
    }
}
