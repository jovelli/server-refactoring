package com.refactoring.examples.conditionals;

import java.time.LocalDate;

public class DecomposeConditional {

    private int monthEndSummer = 3;
    private int dayEndSummer = 20;
    private int monthStartSummer = 12;
    private int dayStartSummer = 21;

    private static final double SUMMER_TAX = .32;
    private static final double PRICE = 100;

    private LocalDate startSummer;
    private LocalDate endSummer;
    private LocalDate date;

    public DecomposeConditional(LocalDate date) {
        this.date = date;

        this.startSummer = LocalDate.of(date.getYear(),  monthStartSummer, dayStartSummer);
        this.endSummer = LocalDate.of(date.getYear(), monthEndSummer, dayEndSummer);
    }

    private boolean isSummer() {
        return this.date.isAfter(startSummer) || this.date.isBefore(endSummer);
    }

    private double summerCharge(double quantity) {
        return quantity * PRICE * (1 + SUMMER_TAX);
    }

    private double notSummerCharge(double quantity) {
        return quantity * PRICE;
    }

    public double charge(int quantity) {
        return (isSummer()) ? summerCharge(quantity) : notSummerCharge(quantity);
    }
}
