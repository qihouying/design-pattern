package com.design.pattern.command.impl;

import com.design.pattern.command.Command;
import com.design.pattern.command.Stereo;

/**
 * Created by dream on 09/04/2017.
 */
public class StereoOnWithCommand implements Command {
    Stereo stereo;

    public StereoOnWithCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    public void undo() {

    }
}
