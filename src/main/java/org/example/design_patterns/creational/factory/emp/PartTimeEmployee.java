package org.example.design_patterns.creational.factory.emp;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, int monthlyIncome) {
        super(name, monthlyIncome);
        this.setWeekHours(20);
    }
}
