package com.singh.design.patterns.strategy.gear.system;

public class ManualGearSystem implements GearSystem {
    @Override
    public void changeGear() {
        System.out.println("Changed gears manually.");
    }
}
