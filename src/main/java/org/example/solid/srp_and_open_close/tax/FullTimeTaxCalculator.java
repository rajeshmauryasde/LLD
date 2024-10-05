package org.example.solid.srp_and_open_close.tax;

import org.example.solid.srp_and_open_close.emp.Employee;

public class FullTimeTaxCalculator extends TaxCalculator {
    private static final double INCOME_TAX = 0.3;
    private static final double PROFESSIONAL_TAX = 0.02;
    private static final double EDUCATION_LESS = 0.01;


    @Override
    public double calculateTax(Employee employee) {
        return employee.getMonthlyIncome() * INCOME_TAX + employee.getMonthlyIncome() * PROFESSIONAL_TAX - employee.getMonthlyIncome() * EDUCATION_LESS;
    }
}
