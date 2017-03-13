package com.design.pattern.strategy;

import com.design.pattern.strategy.behavior.impl.MallardDuck;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年02月12 00:53.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performBehavior();
        mallardDuck.performQuack();
    }
}
