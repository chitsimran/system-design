package com.singh.low.level.design.parking.lot.model.parking;

import com.singh.low.level.design.parking.lot.model.vehicle.Vehicle;

public class ParkingSpot {
    private Long parkingNumber;
    private Vehicle vehicle;
    public Boolean isVacant;

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isVacant = false;
    }

    public Vehicle removeVehicle() {
        Vehicle vehicleToBeRemoved = this.vehicle;
        this.vehicle = null;
        this.isVacant = true;
        return vehicleToBeRemoved;
    }
}
