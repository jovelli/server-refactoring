package com.refactoring.examples.movemethod;

public class Account {

    private AccountType accountType = new AccountType();

    private long daysOverdrawn = 12;

    public double bankCharge() {
        double result = 4.5;

        if (daysOverdrawn > 0) result += accountType.overdraftCharge(this);

        return result;
    }

    public long getDaysOverdrawn() {
        return this.daysOverdrawn;
    }

}
