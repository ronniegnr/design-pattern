package bd.com.ronnie.observer;

public class Main {

    public static void main(String[] args) {
        Subject weatherData = new WeatherData(10, 15, 20);
        Observer currentConditionsDisplay = new CurrentConditionsDisplay();
        weatherData.registerObserver(currentConditionsDisplay);
        ((CurrentConditionsDisplay) currentConditionsDisplay).display();

        ((WeatherData) weatherData).updateData(15, 20, 25);
        ((WeatherData) weatherData).updateData(20, 25, 30);
    }
}
