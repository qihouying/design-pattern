package com.design.pattern.strategy;

/**
 * Desc: 抽象策略角色:给出所有的具体策略类所需要的接口(鸭叫)
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年02月12 00:39.
 */
public interface QuackBehavior {
    public void quack();
}
