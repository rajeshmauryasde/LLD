package org.example.solid.srp_and_open_close;

public class FullTimeTaxCalculator extends TaxCalculator{

    @Override
    public double calculateTax(Employee employee) {
        return employee.getMonthlyIncome() * 0.3;
    }
}
