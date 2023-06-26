package com.singh.low.level.design.parking.lot.service.factory;

import com.singh.low.level.design.parking.lot.enums.VehicleType;
import com.singh.low.level.design.parking.lot.service.parking.FourWheelerParkingService;
import com.singh.low.level.design.parking.lot.service.parking.ParkingService;
import com.singh.low.level.design.parking.lot.service.parking.TwoWheelerParkingService;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ParkingServiceFactory {
    private static volatile ParkingServiceFactory parkingServiceFactory;
    private static Map<VehicleType, ParkingService> parkingServiceMap;

    private ParkingServiceFactory() {}

    public static synchronized ParkingServiceFactory getInstance() {
        if (Objects.isNull(parkingServiceFactory)) {
            synchronized (ParkingServiceFactory.class) {
                if (Objects.isNull(parkingServiceFactory)) {
                    parkingServiceFactory = new ParkingServiceFactory();
                    parkingServiceMap = new HashMap<>();
                }
            }
        }
        return parkingServiceFactory;
    }

    public ParkingService getParkingService(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                return parkingServiceMap.getOrDefault(VehicleType.TWO_WHEELER, new TwoWheelerParkingService());

            case FOUR_WHEELER:
                return parkingServiceMap.getOrDefault(VehicleType.FOUR_WHEELER, new FourWheelerParkingService());

            default:
                throw new IllegalArgumentException("No such Parking Service available");
        }
    }
}
