package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean getIsWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean Weekend) {
        this.isWeekend = Weekend;
    }


    public double getPrice(){
        return this.getRoomType().equalsIgnoreCase("king") ? 139 : 124;
    }

    public double getReservationTotal(){
        double total = this.getNumberOfNights() * getPrice();

        if (this.getIsWeekend()) {
            total = total + (total * .1);
        }
        return total;
    }
}
