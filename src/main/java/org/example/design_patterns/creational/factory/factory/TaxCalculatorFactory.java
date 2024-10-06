package org.example.design_patterns.creational.factory.factory;

import org.example.design_patterns.creational.factory.emp.Employee;
import org.example.design_patterns.creational.factory.emp.FullTimeEmployee;
import org.example.design_patterns.creational.factory.emp.Intern;
import org.example.design_patterns.creational.factory.emp.PartTimeEmployee;
import org.example.design_patterns.creational.factory.tax.FullTimeTaxCalculator;
import org.example.design_patterns.creational.factory.tax.InternTaxCalculator;
import org.example.design_patterns.creational.factory.tax.PartTimeTaxCalculator;
import org.example.design_patterns.creational.factory.tax.TaxCalculator;

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