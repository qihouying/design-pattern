package com.design.pattern.strategy.Context;

import com.design.pattern.strategy.FlyBehavior;
import com.design.pattern.strategy.QuackBehavior;

/**
 * Desc: 拥有对strategy的引用
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年02月12 00:35.
 */
public abstract class Duck {
    public QuackBehavior quackBehavior;
    public FlyBehavior flyBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
