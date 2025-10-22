package com.pluralsight;

public class TheApp {
    public static void main(String[] args) {

        // testing our room
        Room bestRoom = new Room(2, 100.00, false, false);

        // is it available?
        System.out.println("is the room available: " + bestRoom.isAvailable());

        // if statement similar to above
        if (bestRoom.isAvailable()) {
            System.out.println("Bob the room is available");
        } else {
            System.out.println("sucks for you, no room available");
        }

        // change property to make the room not available
        bestRoom.setDirty(true);

        // is it available?
        System.out.println("is the room available: " + bestRoom.isAvailable());

        // testing the reservation
        Reservation reservation1 = new Reservation("king", 1, false);

        // check the price
        System.out.println(reservation1.getPrice());

        // check the reservation total
        System.out.println(reservation1.getReservationTotal());

        // change to a weekend  (use setIsWeekend — matches your class)
        reservation1.setIsWeekend(true);

        // check the price
        System.out.println(reservation1.getPrice());

        // check the reservation total
        System.out.println(reservation1.getReservationTotal());

        // change number of nights
        reservation1.setNumberOfNights(2);

        // check the reservation total
        System.out.println(reservation1.getReservationTotal());


        // test the employee
        Employee Employee1 = new Employee("1", "Caleb", "Desk", 12.00, 40);

        // print out regular hours (your getHoursWorked returns the total; regular is capped at 40 in getRegularHours)
        System.out.println(Employee1.getHoursWorked());

        // print out OT hours
        System.out.println(Employee1.getOvertimeHours());

        // print total pay
        System.out.println(Employee1.getTotalPay());

        // add another hour so there is overtime (setter takes int in your class)
        Employee1.setHoursWorked(41);

        // print out regular hours
        System.out.println(Employee1.getHoursWorked());

        // print out OT hours
        System.out.println(Employee1.getOvertimeHours());

        // print total pay
        System.out.println(Employee1.getTotalPay());

        // test punch in/out methods
        Employee1.punchIn();
        try {
            Thread.sleep(1200); // simulate ~1.2 seconds of work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Employee1.punchOut();

        System.out.println(Employee1.getHoursWorked());


    }
}
