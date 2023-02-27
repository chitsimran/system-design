package com.singh.design.patterns.strategy;

public class LuxuryCar extends Vehicle {
    public LuxuryCar() {
        super(new AutomaticGearSystem());
    }
}
