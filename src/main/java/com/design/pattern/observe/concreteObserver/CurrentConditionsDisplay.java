package com.design.pattern.observe.concreteObserver;

import com.design.pattern.observe.DisplayElement;
import com.design.pattern.observe.Observer;
import com.design.pattern.observe.Subject;

/**
 * Desc:
 *
 * @author: qihouying@meituan.com
 * @Date: 2017年02月12 17:44.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
