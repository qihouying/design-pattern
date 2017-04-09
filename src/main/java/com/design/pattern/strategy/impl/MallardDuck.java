package com.design.pattern.strategy.impl;

import com.design.pattern.strategy.Duck;
import com.design.pattern.strategy.behavior.impl.FlyWithWings;
import com.design.pattern.strategy.behavior.impl.Quack;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年02月12 00:52.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
