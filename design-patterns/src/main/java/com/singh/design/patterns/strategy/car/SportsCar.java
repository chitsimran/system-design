package com.singh.design.patterns.strategy.car;

import com.singh.design.patterns.strategy.gear.system.ManualGearSystem;

public class SportsCar extends Vehicle {
    public SportsCar() {
        super(new ManualGearSystem());
    }
}
