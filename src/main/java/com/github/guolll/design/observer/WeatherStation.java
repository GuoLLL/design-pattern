package com.github.guolll.design.observer;

/**
 * 天气观测站，测试类
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();//观察目标
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);//观察者
        weatherData.setMeasurements(30F, 65F, 30.4F);//观察目标发生改变
        conditionDisplay.display();
    }
}
