package com.singh.design.patterns.observer.observer;

import com.singh.design.patterns.observer.observable.StockObservable;

public class EmailAlertObserver implements AlertObserver {
    private StockObservable stockObservable;

    public EmailAlertObserver(StockObservable stockObservable) {
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Sent email: Stock available now!");
    }
}
