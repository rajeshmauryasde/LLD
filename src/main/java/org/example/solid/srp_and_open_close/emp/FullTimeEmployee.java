package org.example.solid.srp_and_open_close.emp;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int monthlyIncome) {
        super(name, monthlyIncome);
        this.setWeekHours(40);
    }
}
