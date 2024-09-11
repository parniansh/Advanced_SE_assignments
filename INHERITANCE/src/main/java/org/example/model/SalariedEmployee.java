package org.example.model;

public class SalariedEmployee extends Employee{
    private Integer weeklySalary;
    public SalariedEmployee(String firstName, String lastName, String SSN, Integer weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    public Integer getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(Integer weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
