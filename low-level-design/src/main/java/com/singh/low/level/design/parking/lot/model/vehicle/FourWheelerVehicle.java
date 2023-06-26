package com.singh.low.level.design.parking.lot.model.vehicle;

import com.singh.low.level.design.parking.lot.enums.VehicleType;

public class FourWheelerVehicle extends Vehicle {
    public FourWheelerVehicle(String vehicleNumber) {
        super(vehicleNumber, VehicleType.FOUR_WHEELER);
    }
}
