package com.github.guolll.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察目标，天气数据
 */
public class WeatherData implements Subject {

    private List<Observer> observers; //观察者
    private float temp; //温度
    private float humidity;//湿度
    private float pressure;//气压

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }

    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }


    /**
     * 天气数据改变
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.setTemp(temp);
        this.setHumidity(humidity);
        this.setPressure(pressure);
        //通知观察者
        this.notifyObserver();
    }

    public WeatherData() {
        observers = new ArrayList<Observer>(0);
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
