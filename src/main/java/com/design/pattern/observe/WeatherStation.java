package com.design.pattern.observe;

import com.design.pattern.observe.impl.CurrentConditionsDisplay;
import com.design.pattern.observe.impl.WeatherData;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年02月12 17:50.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherdata = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherdata);
        weatherdata.setMeasurements(80f, 65f, 30.4f);
        weatherdata.setMeasurements(82f, 70f, 29.2f);
        weatherdata.setMeasurements(78f, 90f, 29.2f);

    }
}
