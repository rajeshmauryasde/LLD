package org.example.solid.srp_and_open_close.emp;

public class Intern extends Employee {
    public Intern(String name, int monthlyIncome) {
        super(name, monthlyIncome);
        this.setWeekHours(40);
    }
}
