package org.example.design_patterns.creational.factory.emp;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int monthlyIncome) {
        super(name, monthlyIncome);
        this.setWeekHours(40);
    }
}
