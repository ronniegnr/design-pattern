package com.ronniegnr.designpattern.behavior.observer;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayElement currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.5f);
        weatherData.setMeasurements(40, 55, 10.5f);
    }
}