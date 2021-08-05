package dp.observers;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private float temp;
    private float humidity;
    private float pressure;

    private List<Observer> observers;

    public WeatherStation(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.update();
        }
    }

    public void setWeatherData(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        weatherMeasureChanged();
    }

    private void weatherMeasureChanged() {
        notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
