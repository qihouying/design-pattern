package com.design.pattern.state.concreteState;

import com.design.pattern.state.State;
import com.design.pattern.state.context.GumballMachine;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月15 16:22.
 */
public class WinnerState implements State {
    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    public void dispense() {
        gumballMachine.releaseBall();

        if (0 == gumballMachine.getCount()) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (0 < gumballMachine.getCount()) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override public String toString() {
        return "WinnerState";
    }
}
