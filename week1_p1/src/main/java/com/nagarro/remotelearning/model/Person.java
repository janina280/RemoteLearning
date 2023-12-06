package com.nagarro.remotelearning.model;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String dob;
    private  String dod = null;


    public Person(String string) {
        // Splitting the string based on a comma
        String[] textInput = string.split(",");

        // Assigning the first field to firstName
        firstName = textInput[0];

        // Assigning the second field to lastName
        lastName = textInput[1];

        // Assigning the third field to dob (date of birth)
        dob = textInput[2];

        // Checking if there is a fourth field (date of death)
        if (textInput.length < 4) {

            // If not, set "Still alive" as the value for dod (date of death)
            dod = "Still alive";
        } else {

            // If there is, assign the value of the fourth field to dod (date of death)
            dod = textInput[3];
        }

    }


    @Override
    public String toString() {
        return firstName + " " + lastName + "(" + dob + " " + dod+" )";

    }
}