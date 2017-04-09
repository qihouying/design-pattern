package com.design.pattern.strategy.ConcreteStrategy;

import com.design.pattern.strategy.QuackBehavior;

/**
 * Desc:吱吱叫
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年02月12 00:46.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
