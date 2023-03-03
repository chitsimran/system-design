package com.singh.design.patterns.observer;

import com.singh.design.patterns.DesignPattern;
import com.singh.design.patterns.enums.DesignPatternName;
import com.singh.design.patterns.observer.observable.MobileObservable;
import com.singh.design.patterns.observer.observable.StockObservable;
import com.singh.design.patterns.observer.observer.AlertObserver;
import com.singh.design.patterns.observer.observer.EmailAlertObserver;
import com.singh.design.patterns.observer.observer.MessageAlertObserver;

public class ObserverPattern implements DesignPattern {
    @Override
    public DesignPatternName getName() {
        return DesignPatternName.OBSERVER;
    }

    @Override
    public void run() {
        StockObservable stockObservable = new MobileObservable();
        AlertObserver emailAlertObserver = new EmailAlertObserver(stockObservable);
        AlertObserver messageAlertObserver = new MessageAlertObserver(stockObservable);

        stockObservable.add(emailAlertObserver);
        stockObservable.add(messageAlertObserver);

        stockObservable.updateStockCount(10);
    }
}
