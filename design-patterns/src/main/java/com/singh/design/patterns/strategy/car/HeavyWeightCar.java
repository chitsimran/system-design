package com.singh.design.patterns.strategy.car;

import com.singh.design.patterns.strategy.gear.system.ManualGearSystem;

public class HeavyWeightCar extends Vehicle {
    public HeavyWeightCar() {
        super(new ManualGearSystem());
    }
}
