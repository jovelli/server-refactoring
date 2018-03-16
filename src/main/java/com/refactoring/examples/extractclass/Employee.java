package com.refactoring.examples.extractclass;

public class Employee extends Party {

    public Employee(long id, String name, double annualCost) {
        super(id, name);
        this.annualCost = annualCost;
    }
}
