package com.design.pattern.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月15 22:59.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    public GumballMachine(String location, int numberGumballs) throws RemoteException {
    }
}
