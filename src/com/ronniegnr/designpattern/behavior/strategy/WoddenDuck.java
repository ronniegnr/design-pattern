package com.ronniegnr.designpattern.behavior.strategy;

public class WoddenDuck extends Duck {
    public WoddenDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Wodden Duck");
    }
}
