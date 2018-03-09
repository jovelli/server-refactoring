package com.refactoring.examples.separatequerymodifier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QueryAndModifier {

    private static final String personFound1 = "John";
    private static final String personFound2 = "Mike";

    private static final Logger LOGGER = LogManager.getLogger(QueryAndModifier.class);

    public void sendAlert(String[] people) {
        LOGGER.info(findWrongPeople(people));
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
