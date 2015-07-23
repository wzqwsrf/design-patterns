package observer;

import java.util.Observable;

/**
 * @author: wangzhenqing
 * @date: 2015-07-23 15:29:22
 * @description: 使用JDK内置Observable
 */
public class WeatherDataNew extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataNew() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
