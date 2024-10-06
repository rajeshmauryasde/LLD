package org.example.design_patterns.creational.factory;

import org.example.design_patterns.creational.factory.emp.Employee;
import org.example.design_patterns.creational.factory.emp.FullTimeEmployee;
import org.example.design_patterns.creational.factory.emp.Intern;
import org.example.design_patterns.creational.factory.emp.PartTimeEmployee;
import org.example.design_patterns.creational.factory.factory.TaxCalculatorFactory;
import org.example.design_patterns.creational.factory.tax.TaxCalculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("John Doe", 1000));
        employees.add(new Intern("Jane Doe", 500));
        employees.add(new PartTimeEmployee("Jack Doe", 500));

        for (Employee employee : employees) {
            TaxCalculator taxCalculator = TaxCalculatorFactory.getTaxCalculator(employee);
            System.out.println(taxCalculator.calculateTax(employee));
        }


    }
}
