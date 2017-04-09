package com.design.pattern.decorator.concreteComponent;

import com.design.pattern.decorator.Beverage;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月09 12:38.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
