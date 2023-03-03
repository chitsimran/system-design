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

    /**
     * Add a new Subscriber
     *
     * @param alertObserver observer (or subscriber) to be added
     */
    @Override
    public void add(AlertObserver alertObserver) {
        subscribers.add(alertObserver);
    }

    /**
     * Remove a subscriber
     *
     * @param alertObserver observer (or subscriber) to be removed
     */
    @Override
    public void remove(AlertObserver alertObserver) {
        subscribers.remove(alertObserver);
    }

    /**
     * Notifies all subscribers on a state change
     */
    @Override
    public void notifySubscribers() {
        subscribers.forEach(AlertObserver::update);
    }

    /**
     * Updates stock count (updates state)
     *
     * @param stock new stock count
     */
    @Override
    public void updateStockCount(Integer stock) {
        if (this.stock == 0)
            notifySubscribers();
        this.stock = stock;
    }

    /**
     * @return the stock count
     */
    @Override
    public Integer getStockCount() {
        return stock;
    }
}
