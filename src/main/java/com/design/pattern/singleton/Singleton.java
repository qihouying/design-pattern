package com.design.pattern.singleton;

/**
 * it is right when jdk >= 1.4, or it is wrong under the condition of multi thread
 * double lock
 * Created by dream on 08/04/2017.
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                if (null == singleton) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
