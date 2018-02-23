package com.refactoring.examples.hidedelegate;

public class Department {

    private long chargeCode;
    private String manager = "Oswald Default";

    public long getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(long chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
