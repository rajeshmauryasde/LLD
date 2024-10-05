package org.example.solid.srp_and_open_close;

import org.example.solid.srp_and_open_close.emp.Intern;
import org.example.solid.srp_and_open_close.emp.Employee;
import org.example.solid.srp_and_open_close.emp.FullTimeEmployee;
import org.example.solid.srp_and_open_close.emp.PartTimeEmployee;
import org.example.solid.srp_and_open_close.factory.TaxCalculatorFactory;
import org.example.solid.srp_and_open_close.tax.TaxCalculator;

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
