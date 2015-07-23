package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: wangzhenqing
 * @date:
 * @description:
 */
public class CurrentConditionsDisplayNew implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayNew(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " +
                temperature + "F degrees and " + humidity + "% humidity");
    }


    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherDataNew) {
            WeatherDataNew weatherData = (WeatherDataNew) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
