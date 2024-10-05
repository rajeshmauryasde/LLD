package org.example.solid.srp_and_open_close;

public class TaxCalculator {

    public static double calculateTax(Employee employee) {
        return employee.getMonthlyIncome() * 0.2;
    }
}
