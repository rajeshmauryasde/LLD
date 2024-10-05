package org.example.solid.srp_and_open_close;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Employee {
    private final String firstName;
    private final String lastName;
    @Setter
    private int monthlyIncome;
    @Setter
    private int weekHours;

    public Employee(String name, int monthlyIncome) {
        String[] names = name.split(" ");
        this.firstName = names[0];
        this.lastName = names[names.length - 1];
        this.monthlyIncome = monthlyIncome;
    }
}
