package com.singh.low.level.design.parking.lot.model.gate;

import com.singh.low.level.design.parking.lot.service.factory.ParkingServiceFactory;
import com.singh.low.level.design.parking.lot.service.parking.ParkingService;

public class ExitGate extends Gate {
    private ParkingServiceFactory parkingServiceFactory;

    public ExitGate(ParkingService parkingService, Boolean isOpen, Integer floorNumber, Integer gateNumber) {
        super(isOpen, floorNumber, gateNumber);
        this.parkingServiceFactory = ParkingServiceFactory.getInstance();
    }
}
