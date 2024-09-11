package org.example;

import org.example.model.BaseEmployee;
import org.example.model.CommisionEmployee;
import org.example.model.HourlyEmployee;
import org.example.model.SalariedEmployee;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {





    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("Joe", "Jones","111-11-1111", 2500);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25,32);
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19,47);
        CommisionEmployee commisionEmployee = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 15,50000);
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee baseEmployee = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommisionEmployee commisionEmployee1 = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

    }
}