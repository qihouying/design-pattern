package com.design.pattern.decorator.concreteComponent;

import com.design.pattern.decorator.Beverage;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月09 12:59.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .56;
    }
}
