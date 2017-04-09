package com.design.pattern.strategy.test;

import com.design.pattern.strategy.Context.Duck;
import com.design.pattern.strategy.ConcreteStrategy.FlyRocketPowered;
import com.design.pattern.strategy.Context.impl.MallardDuck;
import com.design.pattern.strategy.Context.impl.ModelDuck;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年02月12 00:53.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }
}
