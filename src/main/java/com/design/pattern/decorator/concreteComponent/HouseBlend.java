package com.design.pattern.decorator.concreteComponent;

import com.design.pattern.decorator.Beverage;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月09 12:38.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }
    @Override
    public double cost() {
        return .89;
    }
}
