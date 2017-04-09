package com.design.pattern.decorator.test;

import com.design.pattern.decorator.Beverage;
import com.design.pattern.decorator.concreteComponent.DarkRoast;
import com.design.pattern.decorator.concreteComponent.Espresso;
import com.design.pattern.decorator.concreteComponent.HouseBlend;
import com.design.pattern.decorator.concreteDecorator.Mocha;
import com.design.pattern.decorator.concreteDecorator.Soy;
import com.design.pattern.decorator.concreteDecorator.Whip;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月09 12:52.
 */
public class StarbuzzCoffeeTest {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$ " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());
    }

}
