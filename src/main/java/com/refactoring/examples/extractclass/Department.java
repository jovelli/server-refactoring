package com.refactoring.examples.extractclass;

import java.util.ArrayList;
import java.util.List;

public class Department extends Party {
    private List<Party> parties = new ArrayList<>();

    public Department(long id, String name) {
        super(id, name);
    }

    public double getAnnualCost() {
        double result = 0.0;

        for (Party party : parties) {
            result += party.getAnnualCost();
        }

        return result;
    }

    public List<Party> getparties() {
        return this.parties;
    }

    public void addParty(Party party) {
        this.parties.add(party);
    }

    public int headCount() {
        return this.parties.size();
    }
}
