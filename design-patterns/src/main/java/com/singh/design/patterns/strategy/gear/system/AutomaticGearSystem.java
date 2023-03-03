package com.singh.design.patterns.strategy.gear.system;

public class AutomaticGearSystem implements GearSystem {
    @Override
    public void changeGear() {
        System.out.println("Changed gears automatically.");
    }
}
