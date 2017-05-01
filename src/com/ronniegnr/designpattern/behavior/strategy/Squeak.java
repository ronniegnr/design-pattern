package com.ronniegnr.designpattern.behavior.strategy;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
