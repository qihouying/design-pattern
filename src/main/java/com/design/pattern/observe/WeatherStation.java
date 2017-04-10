package com.design.pattern.observe;

import com.design.pattern.observe.concreteObserver.CurrentConditionsDisplay;
import com.design.pattern.observe.concreteSubject.WeatherData;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年02月12 17:50.
 */
public class WeatherStation {
    public static void main(String[] args) {
        // 创建具体主题类的实例
        WeatherData weatherdata = new WeatherData();

        // 创建一个具体观察者对象,在构造器中,该观察者向主题对象注册
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherdata);

        // 改变主题的状态
        weatherdata.setMeasurements(80f, 65f, 30.4f);
        weatherdata.setMeasurements(82f, 70f, 29.2f);
        weatherdata.setMeasurements(78f, 90f, 29.2f);

    }
}
