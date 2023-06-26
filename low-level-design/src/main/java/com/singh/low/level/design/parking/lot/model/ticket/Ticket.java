package com.singh.low.level.design.parking.lot.model.ticket;

import com.singh.low.level.design.parking.lot.model.parking.ParkingSpot;
import com.singh.low.level.design.parking.lot.model.vehicle.Vehicle;

import java.util.UUID;

public class Ticket {
    private UUID id;
    private Long entryTime;
    private Long exitTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;

    private Ticket() {}

    private Ticket(Vehicle vehicle, Long entryTime, ParkingSpot parkingSpot) {
        this.id = UUID.randomUUID();
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
    }

    public static Ticket generateTicket(Vehicle vehicle, Long entryTime, ParkingSpot parkingSpot) {
        return new Ticket(vehicle, entryTime, parkingSpot);
    }
}
