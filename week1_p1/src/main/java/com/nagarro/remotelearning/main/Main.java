package com.nagarro.remotelearning.main;

import com.nagarro.remotelearning.model.Person;
import com.nagarro.remotelearning.util.PersonManager;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Person> personages;
        PersonManager fileParser = new PersonManager();
        personages = fileParser.read("W1P1input.txt");
        for (Person person : personages) {
            System.out.println(person.toString());
        }

    }
}