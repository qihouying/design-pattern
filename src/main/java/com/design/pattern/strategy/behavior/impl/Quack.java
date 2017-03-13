package com.design.pattern.strategy.behavior.impl;

import com.design.pattern.strategy.behavior.QuackBehavior;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年02月12 00:44.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
