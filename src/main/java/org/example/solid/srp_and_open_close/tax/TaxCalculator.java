package org.example.solid.srp_and_open_close.tax;

import org.example.solid.srp_and_open_close.emp.Employee;

public abstract class TaxCalculator {

    public abstract double calculateTax(Employee employee);
}
