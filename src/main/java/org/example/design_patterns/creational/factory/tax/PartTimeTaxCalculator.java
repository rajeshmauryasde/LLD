package org.example.design_patterns.creational.factory.tax;

import org.example.design_patterns.creational.factory.emp.Employee;

public class PartTimeTaxCalculator extends TaxCalculator {
    private static final double INCOME_TAX = 0.2;
    private static final double PROFESSIONAL_TAX = 0.03;
    private static final double EDUCATION_LESS = 0.01;

    @Override
    public double calculateTax(Employee employee) {
        return employee.getMonthlyIncome() * INCOME_TAX + employee.getMonthlyIncome() * PROFESSIONAL_TAX - employee.getMonthlyIncome() * EDUCATION_LESS;
    }
}
