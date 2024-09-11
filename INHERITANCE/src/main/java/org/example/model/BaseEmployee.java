package org.example.model;

public class BaseEmployee extends Employee{

    private Integer baseSalary;
    public BaseEmployee(String firstName, String lastName, String SSN, Integer baseSalary) {
        super(firstName, lastName, SSN);
        this.baseSalary = baseSalary;
    }

    public Integer getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Integer baseSalary) {
        this.baseSalary = baseSalary;
    }
}
