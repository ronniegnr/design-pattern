package com.ronniegnr.designpattern.behavior.strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
