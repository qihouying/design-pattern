package com.design.pattern.singleton;

/**
 * simple method. It needs to create the instance before being accessed
 * Created by dream on 08/04/2017.
 */
public class SingletonEagerly {
    private static SingletonEagerly singleton = new SingletonEagerly();

    private SingletonEagerly() {
    }

    public static SingletonEagerly getInstace() {
        return singleton;
    }
}
