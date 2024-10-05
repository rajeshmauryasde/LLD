package org.example.solid.srp_and_open_close;

public class TaxCalculatorFactory {

    public static TaxCalculator getTaxCalculator(Employee employee) {
        return switch (employee) {
            case FullTimeEmployee fullTimeEmployee -> new FullTimeTaxCalculator();
            case Contractor contractor -> new ContractorTaxCalculator();
            case PartTimeEmployee partTimeEmployee -> new PartTimeTaxCalculator();
            default -> throw new RuntimeException("Invalid employee type");
        };
    }
}