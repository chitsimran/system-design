package com.singh.design.patterns.strategy;

public class ManualGearSystem implements GearSystem {
    @Override
    public void changeGear() {
        System.out.println("Changed gears manually.");
    }
}
