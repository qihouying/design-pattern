package com.design.pattern.proxy.concreteState;

import com.design.pattern.proxy.State;
import com.design.pattern.state.context.GumballMachine;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月15 16:22.
 */
public class SoldState implements State {
    private transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
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
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }

    public GumballMachine getGumballMachine() {
        return gumballMachine;
    }

    public void setGumballMachine(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public String toString() {
        return "SoldState";
    }
}
