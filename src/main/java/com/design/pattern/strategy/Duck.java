package com.design.pattern.strategy;

import com.design.pattern.strategy.behavior.FlyBehavior;
import com.design.pattern.strategy.behavior.QuackBehavior;

/**
 * Desc:
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
