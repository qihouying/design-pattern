package com.design.pattern.decorator;

/**
 * Desc: 继承Beverage,是为了让Condiment Decorator能取代Beverage
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月09 12:33.
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
