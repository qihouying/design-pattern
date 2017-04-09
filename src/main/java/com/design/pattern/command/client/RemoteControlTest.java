package com.design.pattern.command.client;

import com.design.pattern.command.invoker.RemoteControl;
import com.design.pattern.command.concreteCommand.*;
import com.design.pattern.command.receiver.CeilingFan;
import com.design.pattern.command.receiver.GarageDoor;
import com.design.pattern.command.receiver.Light;
import com.design.pattern.command.receiver.Stereo;

/** Desc: create a concreteCommand and specify the receiver
 *
 * Created by dream on 09/04/2017.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // install all the devices on the fit position
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        // create all the light on and off commands
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // create the ceiling fan on and off commands
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        //create garage door up and down commands
        GarageUpCommand garageUpCommand = new GarageUpCommand(garageDoor);
        GarageDownCommand garageDownCommand = new GarageDownCommand(garageDoor);

        // create stereo on and off commands
        StereoOnWithCommand stereoOnWithCommand = new StereoOnWithCommand(stereo);
        StereoOffWithCommand stereoOffWithCommand = new StereoOffWithCommand(stereo);

        // load to the slot of remote invoker
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2,ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(4, garageUpCommand, garageDownCommand);
        remoteControl.setCommand(5, stereoOnWithCommand, stereoOffWithCommand);

        System.out.println(remoteControl.toString());

        // press the button for each slot
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);
        remoteControl.onButtonWasPressed(5);
        remoteControl.offButtonWasPressed(5);

        System.out.println(remoteControl.toString());


    }
}
