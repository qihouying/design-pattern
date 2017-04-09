package com.design.pattern.strategy.Context.impl;

import com.design.pattern.strategy.Context.Duck;
import com.design.pattern.strategy.ConcreteStrategy.FlyNoWay;
import com.design.pattern.strategy.ConcreteStrategy.Quack;

/**
 * Desc: 具体策略角色:包装了相关的算法和行为
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月09 11:41.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
