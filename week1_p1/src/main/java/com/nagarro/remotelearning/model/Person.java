package com.nagarro.remotelearning.model;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String dob;
    private String dod;

    public Person(String firstName, String lastName, String dob, String dod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.dod = dod;
    }

    public Person(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + dob + "-" + dod + ")";
    }
}