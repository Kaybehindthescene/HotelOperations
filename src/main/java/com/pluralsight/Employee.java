package com.pluralsight;

import java.time.Duration;
import java.time.LocalDateTime;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private LocalDateTime punchInTime;

    public Employee(String employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    public double getTotalPay(){

        double regularPay = this.getRegularHours() * this.getPayRate();
        double overTimePay = this.getOvertimeHours() * this.getPayRate() * 1.5;

        return regularPay + overTimePay;

    }
    public double getRegularHours(){
        if (this.getHoursWorked() > 40){
            return 40;
        }
        return this.getHoursWorked();
    }

    public double getOvertimeHours(){
        if (this.getHoursWorked() > 40){
            return this.getHoursWorked() - 40;
        }
        return 0;
    }

    public void punchIn(){
        if (punchInTime != null) {
            System.out.println(name + " is already punched in!");
            return;
        }
        punchInTime = LocalDateTime.now();
        System.out.println(name + " punched in at " + punchInTime);
    }

    public void punchOut(){
        if (punchInTime == null){
            System.out.println(name + " needs to punch in first!");
            return;
        }
        LocalDateTime now = LocalDateTime.now();
        long minutes = Duration.between(punchInTime, now).toMinutes();
        double hours = minutes/60.0;
        hoursWorked += hours;
        System.out.printf("%s worked %.2f hours this shift%n ", name, hours);
        punchInTime = null;
    }


}


