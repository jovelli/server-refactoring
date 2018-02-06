package com.refactoring.examples.movemethod;

public class AccountType {

    private final static boolean premium = true;

    public boolean isPremium() {
        return premium;
    }

    public AccountType(){}

    double overdraftCharge(Account account) {
        double result = 10;

        if (isPremium()) {
            if (account.getDaysOverdrawn() > 10) result += (account.getDaysOverdrawn() - 7) * .85;
        } else {
            result = account.getDaysOverdrawn() * 1.75;
        }

        return result;
    }
}
