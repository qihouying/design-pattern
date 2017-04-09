package com.design.pattern.strategy.behavior.impl;

import com.design.pattern.strategy.behavior.FlyBehavior;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月09 11:34.
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
