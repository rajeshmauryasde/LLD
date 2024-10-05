package org.example.solid.srp_and_open_close.factory;

import org.example.solid.srp_and_open_close.emp.Intern;
import org.example.solid.srp_and_open_close.emp.Employee;
import org.example.solid.srp_and_open_close.emp.FullTimeEmployee;
import org.example.solid.srp_and_open_close.emp.PartTimeEmployee;
import org.example.solid.srp_and_open_close.tax.InternTaxCalculator;
import org.example.solid.srp_and_open_close.tax.FullTimeTaxCalculator;
import org.example.solid.srp_and_open_close.tax.PartTimeTaxCalculator;
import org.example.solid.srp_and_open_close.tax.TaxCalculator;

public class TaxCalculatorFactory {

    public static TaxCalculator getTaxCalculator(Employee employee) {
        return switch (employee) {
            case FullTimeEmployee fullTimeEmployee -> new FullTimeTaxCalculator();
            case Intern intern -> new InternTaxCalculator();
            case PartTimeEmployee partTimeEmployee -> new PartTimeTaxCalculator();
            default -> throw new RuntimeException("Invalid employee type");
        };
    }
}