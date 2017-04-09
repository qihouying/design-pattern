package com.design.pattern.strategy.test;

import com.design.pattern.strategy.Duck;
import com.design.pattern.strategy.behavior.impl.FlyRocketPowered;
import com.design.pattern.strategy.impl.MallardDuck;
import com.design.pattern.strategy.impl.ModelDuck;

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
