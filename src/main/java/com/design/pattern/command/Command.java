package com.design.pattern.command;

/** Desc: claim an abstract interface for all the concrete command object
 *
 * Created by dream on 09/04/2017.
 */
public interface Command {
    public void execute();

    public void undo();
}
