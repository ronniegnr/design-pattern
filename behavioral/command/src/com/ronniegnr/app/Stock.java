package com.ronniegnr.app;

public class Stock {
    private int size;

    public Stock() {
        this.size = 10;
    }

    public void sellStock() {
        this.size--;
        System.out.println("stock sold. current size: " + this.size);
    }

    public void buyStock() {
        this.size++;
        System.out.println("stock bought. current size: " + this.size);
    }
}
