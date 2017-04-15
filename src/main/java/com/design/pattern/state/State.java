package com.design.pattern.state;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年04月15 16:20.
 */
public interface State {

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
