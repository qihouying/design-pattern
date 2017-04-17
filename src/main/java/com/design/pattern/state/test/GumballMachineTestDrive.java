package com.design.pattern.state.test;

import com.design.pattern.state.context.GumballMachine;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月15 19:00.
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine.toString());
    }
}
