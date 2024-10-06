package org.example.design_patterns.creational.factory.emp;

public class Intern extends Employee {
    public Intern(String name, int monthlyIncome) {
        super(name, monthlyIncome);
        this.setWeekHours(40);
    }
}
