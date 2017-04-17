package com.design.pattern.proxy.concreteState;

import com.design.pattern.proxy.State;
import com.design.pattern.state.context.GumballMachine;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月15 16:22.
 */
public class SoldOutState implements State {
    private transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");

    }

    public void turnCrank() {
        System.out.println("You turned, but there's no gumballs");

    }

    public void dispense() {
        System.out.println("No gumball dispensed");

    }

    @Override public String toString() {
        return "SoldOutState";
    }
}
