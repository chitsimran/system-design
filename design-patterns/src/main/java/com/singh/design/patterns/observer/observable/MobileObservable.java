package com.singh.design.patterns.observer.observable;

import com.singh.design.patterns.observer.observer.AlertObserver;

import java.util.ArrayList;
import java.util.List;

public class MobileObservable implements StockObservable {
    private Integer stock;
    private List<AlertObserver> subscribers;

    public MobileObservable() {
        this.stock = 0;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void add(AlertObserver alertObserver) {
        subscribers.add(alertObserver);
    }

    @Override
    public void remove(AlertObserver alertObserver) {
        subscribers.remove(alertObserver);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(AlertObserver::update);
    }

    @Override
    public void updateStockCount(Integer stock) {
        if (this.stock == 0)
            notifySubscribers();
        this.stock = stock;
    }

    @Override
    public Integer getStockCount() {
        return stock;
    }
}
