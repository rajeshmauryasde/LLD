package org.example.design_patterns.creational.factory.tax;

import org.example.design_patterns.creational.factory.emp.Employee;

public abstract class TaxCalculator {

    public abstract double calculateTax(Employee employee);
}
