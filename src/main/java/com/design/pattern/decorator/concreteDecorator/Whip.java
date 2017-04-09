package com.design.pattern.decorator.concreteDecorator;

import com.design.pattern.decorator.Beverage;
import com.design.pattern.decorator.CondimentDecorator;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月09 12:38.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
