package com.design.pattern.command.impl;

import com.design.pattern.command.Command;
import com.design.pattern.command.Stereo;

/**
 * Created by dream on 09/04/2017.
 */
public class StereoOffWithCommand implements Command {
    Stereo stereo;

    public StereoOffWithCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {

    }
}
