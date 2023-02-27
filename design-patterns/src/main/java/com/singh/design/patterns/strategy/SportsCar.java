package com.singh.design.patterns.strategy;

public class SportsCar extends Vehicle {
    public SportsCar() {
        super(new ManualGearSystem());
    }
}
