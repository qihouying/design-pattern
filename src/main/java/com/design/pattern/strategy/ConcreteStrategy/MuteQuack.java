package com.design.pattern.strategy.ConcreteStrategy;

import com.design.pattern.strategy.QuackBehavior;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年02月12 00:45.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
