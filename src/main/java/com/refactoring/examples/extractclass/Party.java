package com.refactoring.examples.extractclass;

public abstract class Party {
    protected long id;
    protected String name;
    protected double annualCost;

    public Party(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public double getAnnualCost() {
        return annualCost;
    }
}
