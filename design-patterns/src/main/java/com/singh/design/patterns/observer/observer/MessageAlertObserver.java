package com.singh.design.patterns.observer.observer;

import com.singh.design.patterns.observer.observable.StockObservable;

public class MessageAlertObserver implements AlertObserver {
    private StockObservable stockObservable;

    public MessageAlertObserver(StockObservable stockObservable) {
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Sent message: Stock available now!");
    }
}
