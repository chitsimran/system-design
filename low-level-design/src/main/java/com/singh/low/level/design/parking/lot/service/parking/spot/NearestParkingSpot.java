package com.singh.low.level.design.parking.lot.service.parking.spot;

import com.singh.low.level.design.parking.lot.model.gate.EntryGate;
import com.singh.low.level.design.parking.lot.model.parking.ParkingSpot;

public interface NearestParkingSpot {
    ParkingSpot getNearestParkingSpot(EntryGate entryGate);
}
