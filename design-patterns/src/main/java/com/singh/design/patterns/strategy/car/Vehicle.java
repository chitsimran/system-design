package com.singh.design.patterns.strategy.car;

import com.singh.design.patterns.strategy.gear.system.GearSystem;

/**
 * Vehicle class (Base class)
 * Has a HAS-A relationship with GearSystem instead of IS-A relationship.
 * This lets child classes have a different or common GearSystem among them without having to duplicate code.
 */
public class Vehicle {
    private GearSystem gearSystem;

    public Vehicle(GearSystem gearSystem) {
        this.gearSystem = gearSystem;
    }

    public void changeGear() {
        gearSystem.changeGear();
    }
}
