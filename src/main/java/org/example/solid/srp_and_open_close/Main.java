package org.example.solid.srp_and_open_close;

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("John Doe", 1000);
        Employee contractor = new Contractor("Jane Doe", 500);
        Employee partTimeEmployee = new PartTimeEmployee("Jack Doe", 500);

        System.out.println(TaxCalculator.calculateTax(fullTimeEmployee));
        System.out.println(TaxCalculator.calculateTax(contractor));
        System.out.println(TaxCalculator.calculateTax(partTimeEmployee));
    }
}
