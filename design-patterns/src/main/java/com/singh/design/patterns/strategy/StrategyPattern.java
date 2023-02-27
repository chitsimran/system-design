package com.singh.design.patterns.strategy;

import com.singh.design.patterns.DesignPattern;
import com.singh.design.patterns.enums.DesignPatternName;

public class StrategyPattern implements DesignPattern {
    @Override
    public DesignPatternName getName() {
        return DesignPatternName.STRATEGY;
    }

    @Override
    public void run() {
        Vehicle vehicle = new SportsCar();
        Vehicle vehicle1 = new LuxuryCar();
        Vehicle vehicle2 = new HeavyWeightCar();
        vehicle.changeGear();
        vehicle1.changeGear();
        vehicle2.changeGear();
    }
}
