package com.design.pattern.proxy.concreteState;

import com.design.pattern.proxy.State;
import com.design.pattern.state.context.GumballMachine;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月15 16:22.
 */
public class NoQuarterState implements State {
    private transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());

    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");

    }

    public void turnCrank() {
        System.out.println("You turned but there's no quarter");

    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "NoQuarterState";
    }
}
