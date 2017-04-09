package com.design.pattern.decorator.concreteDecorator;

import com.design.pattern.decorator.Beverage;
import com.design.pattern.decorator.CondimentDecorator;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月09 12:38.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }

    @Override
    public double cost() {
        return .78;
    }
}
