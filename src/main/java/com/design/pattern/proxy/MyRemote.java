package com.design.pattern.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Desc: remote interface
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月15 21:57.
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}

