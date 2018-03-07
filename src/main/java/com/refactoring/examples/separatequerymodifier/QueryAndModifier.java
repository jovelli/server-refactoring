package com.refactoring.examples.separatequerymodifier;

public class QueryAndModifier {

    private static final String personFound1 = "John";
    private static final String personFound2 = "Mike";

    public String getSendAlert(String[] people) {
        return findWrongPeople(people);
    }

    private String findWrongPeople(String[] people) {
        for (String person: people) {
            if (person.equals(personFound1)) {
                return personFound1;
            }

            if (person.equals(personFound2)) {
                return personFound2;
            }
        }
        return "";
    }
}
