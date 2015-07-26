package com.ronniegnr.app;


public class Main {

    public static void main(String[] args) {
	    Stock stock = new Stock();
        Broker broker = new Broker();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrder();
    }
}