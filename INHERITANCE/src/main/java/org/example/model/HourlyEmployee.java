package org.example.model;

public class HourlyEmployee extends Employee{

    private int wage;
    private int hours;
    public HourlyEmployee(String firstName, String lastName, String SSN, int wage, int hours) {
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.hours = hours;
    }

    public int getWage() {
        return wage;
    }

    public int getHours() {
        return hours;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
