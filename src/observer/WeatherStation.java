package observer;

/**
 * @author: wangzhenqing
 * @date: 2015-07-22 16:20:02
 * @description: 测试类
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);

        WeatherDataNew weatherDataNew = new WeatherDataNew();
        CurrentConditionsDisplayNew currentConditionsDisplayNew =
                new CurrentConditionsDisplayNew(weatherDataNew);
        weatherDataNew.setMeasurements(80, 65, 30.4f);
    }
}
