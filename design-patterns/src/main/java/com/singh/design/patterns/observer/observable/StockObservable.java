package com.singh.design.patterns.observer.observable;

import com.singh.design.patterns.observer.observer.AlertObserver;

public interface StockObservable {
    /**
     * Add a new Subscriber
     *
     * @param alertObserver observer (or subscriber) to be added
     */
    void add(AlertObserver alertObserver);

    /**
     * Remove a subscriber
     *
     * @param alertObserver observer (or subscriber) to be removed
     */
    void remove(AlertObserver alertObserver);

    /**
     * Notifies all subscribers on a state change
     */
    void notifySubscribers();

    /**
     * Updates stock count (updates state)
     *
     * @param stock new stock count
     */
    void updateStockCount(Integer stock);

    /**
     * @return the stock count
     */
    Integer getStockCount();
}
