package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public  boolean isAvailable(){
        if (!this.isDirty() && !this.isOccupied()){
            return true;
        }

        return !this.isDirty() && !this.isOccupied();
    }

    public boolean checkIn(){
        if (isAvailable()){
            isOccupied = true;
            isDirty = true;
            System.out.println("Guest checked in the room");
            return true;
        }else {
            System.out.println("Room is not available for check in");
            return false;
        }
    }

    public boolean checkOut(){
        if (isOccupied){
            isOccupied = false;
            isDirty = true;
            System.out.println("Guest checked out of room. Room is dirty");
            return true;
        }else {
            System.out.println("Room is dirty already.");
            return false;
        }
    }

    public boolean cleanRoom() {
        if (!isOccupied && isDirty) {
            isDirty = false;
            System.out.println("Room has been cleaned and is ready for the next guest.");
            return true;
        } else {
            System.out.println("Cannot clean: either occupied or already clean.");
            return false;
        }
    }
}
