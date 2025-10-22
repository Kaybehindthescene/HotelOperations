package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        bookedSuites = 0;
        bookBasicRooms = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public void setNumberOfSuites(int numberOfSuites) {
        this.numberOfSuites = numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookBasicRooms = bookBasicRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public void setBookedSuites(int bookedSuites) {
        this.bookedSuites = bookedSuites;
    }

    public int getBookBasicRooms() {
        return bookBasicRooms;
    }

    public void setBookBasicRooms(int bookBasicRooms) {
        this.bookBasicRooms = bookBasicRooms;
    }

    public int availableSuites(){
        return this.getNumberOfSuites() - this.getBookedSuites();
    }

    public int availableRooms(){
        return this.getNumberOfRooms() - this.getBookBasicRooms();
    }

    //bookroom method
    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if (numberOfRooms <= 0) return false;

        if (isSuite){
            if (numberOfRooms <= availableSuites()){
                setBookedSuites(getBookedSuites() + numberOfRooms);
                return true;
            }
        }else {
            if (numberOfRooms <= availableRooms()){
                setBookBasicRooms(getBookBasicRooms() + numberOfRooms);
                return true;
            }
        }
        return false;
    }
}
