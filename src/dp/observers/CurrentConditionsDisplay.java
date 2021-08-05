package dp.observers;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private WeatherStation weatherStation;

    public CurrentConditionsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current weather: " + temp + " Degrees Celsius, " + humidity + "% humidity" + "," + pressure);
    }

    @Override
    public void update() {
        this.temp = weatherStation.getTemp();
        this.humidity = weatherStation.getHumidity();
        this.pressure =weatherStation.getPressure();
        display();
    }
}
