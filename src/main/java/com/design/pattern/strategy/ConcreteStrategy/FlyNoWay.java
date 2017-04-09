package com.design.pattern.strategy.ConcreteStrategy;

import com.design.pattern.strategy.FlyBehavior;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年02月12 00:43.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
