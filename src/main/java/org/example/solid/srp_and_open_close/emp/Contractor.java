package org.example.solid.srp_and_open_close;

public class Contractor extends Employee {
    public Contractor(String name, int monthlyIncome) {
        super(name, monthlyIncome);
        this.setWeekHours(40);
    }
}
