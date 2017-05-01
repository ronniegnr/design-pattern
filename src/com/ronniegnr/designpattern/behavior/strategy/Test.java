package com.ronniegnr.designpattern.behavior.strategy;

public class Test {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck wooden = new WoddenDuck();
        wooden.performFly();
        wooden.performQuack();
    }
}
