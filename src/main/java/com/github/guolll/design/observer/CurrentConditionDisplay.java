package com.github.guolll.design.observer;

/**
 * 观察者，信息布告板
 */
public class CurrentConditionDisplay implements DisplayElement, Observer {

    private WeatherData weatherData;//观察者知道的天气信息（被告知的天气信息）

    /**
     * 创建一个观察者
     *
     * @param weatherData 要观察的天气信息（实际天气）
     */
    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData; //发现观察目标
        this.weatherData.registerObserver(this);//绑定关系
        this.display();
    }

    /**
     * 观察者广播所知道的信息
     */
    public void display() {
        System.out.println("当前天气状况==》温度：" + this.weatherData.getTemp()
                + "°，湿度：" + this.weatherData.getHumidity()
                + ",气压：" + this.weatherData.getPressure());
    }

    /**
     * 通知观察者更新天气信息
     *
     * @param subject 观察目标
     */
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            this.weatherData.setTemp(weatherData.getTemp());
            this.weatherData.setHumidity(weatherData.getHumidity());
            this.weatherData.setPressure(weatherData.getPressure());
        }
    }


    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }
}
