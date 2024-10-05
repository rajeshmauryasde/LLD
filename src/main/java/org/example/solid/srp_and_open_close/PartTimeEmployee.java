package org.example.solid.srp_and_open_close;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, int monthlyIncome) {
        super(name, monthlyIncome);
        this.setWeekHours(20);
    }
}
