package com.design.pattern.decorator.concreteDecorator;

import com.design.pattern.decorator.Beverage;
import com.design.pattern.decorator.CondimentDecorator;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月09 12:40.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
