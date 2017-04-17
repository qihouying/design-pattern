package com.design.pattern.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月15 22:29.
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup(rmi://127.0.0.1/RemoteHello);

            String s = null;

            s = service.sayHello();

            System.out.println(s);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
