package com.design.pattern.proxy.concreteState;

import com.design.pattern.proxy.State;
import com.design.pattern.state.context.GumballMachine;

import java.util.Random;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月15 16:22.
 */
public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    private transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned ...");
        int winner = randomWinner.nextInt(10);
        if ((0 == winner) && (1 < gumballMachine.getCount())) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "hasQuarterState";
    }
}
