package com.singh.design.patterns.observer.observable;

import com.singh.design.patterns.observer.observer.AlertObserver;

public interface StockObservable {
    void add(AlertObserver alertObserver);

    void remove(AlertObserver alertObserver);

    void notifySubscribers();

    void updateStockCount(Integer stock);

    Integer getStockCount();
}
