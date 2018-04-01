package bd.com.ronnie.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private float temp;
    private float humidity;
    private float pressure;

    private List<Observer> observers = new ArrayList<>();

    public WeatherData() {
    }

    public WeatherData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(temp, humidity, pressure));
    }

    public void updateData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}
