package com.design.pattern.strategy.Context.impl;

import com.design.pattern.strategy.Context.Duck;
import com.design.pattern.strategy.ConcreteStrategy.FlyWithWings;
import com.design.pattern.strategy.ConcreteStrategy.Quack;

/**
 * Desc: 具体策略角色:包装了相关的算法和行为
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
