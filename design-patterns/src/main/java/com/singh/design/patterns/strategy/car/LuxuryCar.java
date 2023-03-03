package com.singh.design.patterns.strategy.car;

import com.singh.design.patterns.strategy.gear.system.AutomaticGearSystem;

public class LuxuryCar extends Vehicle {
    public LuxuryCar() {
        super(new AutomaticGearSystem());
    }
}
