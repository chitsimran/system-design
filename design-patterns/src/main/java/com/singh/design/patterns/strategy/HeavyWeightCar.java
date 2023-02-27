package com.singh.design.patterns.strategy;

public class HeavyWeightCar extends Vehicle {
    public HeavyWeightCar() {
        super(new ManualGearSystem());
    }
}
