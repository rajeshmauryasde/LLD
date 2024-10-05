package org.example.solid.srp_and_open_close;

public class ContractorTaxCalculator extends TaxCalculator{
    @Override
    public double calculateTax(Employee employee) {
        return employee.getMonthlyIncome() * 0.2;
    }
}
