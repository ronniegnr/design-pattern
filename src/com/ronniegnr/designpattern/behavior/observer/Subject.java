package com.ronniegnr.designpattern.behavior.observer;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
