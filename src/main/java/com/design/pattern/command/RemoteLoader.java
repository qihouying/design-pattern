package com.design.pattern.command;

/**
 * Created by dream on 09/04/2017.
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        System.out.println(remoteControl.toString());

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        System.out.println(remoteControl.toString());

        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(0);

        System.out.println(remoteControl.toString());

    }
}
