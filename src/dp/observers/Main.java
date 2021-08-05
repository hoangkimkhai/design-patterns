package dp.observers;

import dp.observers.CurrentConditionsDisplay;
import dp.observers.WeatherStation;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherStation);
        weatherStation.setWeatherData(27.6f, 2.22f, 33.3f);
        weatherStation.setWeatherData(27.631f, 232.22f, 333.3f);
        weatherStation.setWeatherData(69.69f, 96.96f, 33.3f);
	// write your code here
    }
}
