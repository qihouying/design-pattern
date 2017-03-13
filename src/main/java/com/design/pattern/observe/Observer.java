package com.design.pattern.observe;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年02月12 17:31.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
