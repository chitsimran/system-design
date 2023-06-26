package com.singh.low.level.design.parking.lot.model.vehicle;

import com.singh.low.level.design.parking.lot.enums.VehicleType;

public class TwoWheelerVehicle extends Vehicle {
    public TwoWheelerVehicle(String vehicleNumber) {
        super(vehicleNumber, VehicleType.TWO_WHEELER);
    }
}
