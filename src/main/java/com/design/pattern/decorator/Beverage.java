package com.design.pattern.decorator;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月09 12:32.
 */
public abstract class Beverage {
    public String description = "Unkown Bevarage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
