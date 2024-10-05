package org.example.solid.srp_and_open_close.tax;

import org.example.solid.srp_and_open_close.emp.Employee;

public class InternTaxCalculator extends TaxCalculator{
    private static final double INCOME_TAX = 0.15;
    private static final int MAX_NON_TAXABLE_INCOME = 300000;

    @Override
    public double calculateTax(Employee employee) {
        return employee.getMonthlyIncome() < MAX_NON_TAXABLE_INCOME ? 0 : employee.getMonthlyIncome() * INCOME_TAX;
    }
}
