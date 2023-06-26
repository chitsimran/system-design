package com.singh.low.level.design.parking.lot.model.gate;

public class Gate {
    private Boolean isOpen;
    private Integer floorNumber;
    private Integer gateNumber;

    public Gate(Boolean isOpen, Integer floorNumber, Integer gateNumber) {
        this.isOpen = isOpen;
        this.floorNumber = floorNumber;
        this.gateNumber = gateNumber;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Integer getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(Integer gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }
}
