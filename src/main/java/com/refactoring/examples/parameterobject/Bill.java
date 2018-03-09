package com.refactoring.examples.parameterobject;

import java.time.LocalDate;

public final class Bill {
    private double value;
    private LocalDate date;

    public Bill(double value, LocalDate date) {
        this.value = value;
        this.date = date;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public double getValue() {
        return this.value;
    }
}
