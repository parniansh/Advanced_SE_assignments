package org.example.model;

public class CommisionEmployee extends Employee{
      private float commisionRate;
      private Integer grossSales;
    public CommisionEmployee(String firstName, String lastName, String SSN, float commisionRate, Integer grossSales) {
        super(firstName, lastName, SSN);
        this.commisionRate = commisionRate;
                this.grossSales = grossSales;
    }

    public float getCommisionRate() {
        return commisionRate;
    }

    public Integer getGrossSales() {
        return grossSales;
    }

    public void setCommisionRate(float commisionRate) {
        this.commisionRate = commisionRate;
    }

    public void setGrossSales(Integer grossSales) {
        this.grossSales = grossSales;
    }
}
