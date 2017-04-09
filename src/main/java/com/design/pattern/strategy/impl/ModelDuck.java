package com.design.pattern.strategy.impl;

import com.design.pattern.strategy.Duck;
import com.design.pattern.strategy.behavior.impl.FlyNoWay;
import com.design.pattern.strategy.behavior.impl.Quack;

/**
 * Desc:
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
