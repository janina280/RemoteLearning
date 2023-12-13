package com.nagarro.remotelearning.main;

import com.nagarro.remotelearning.model.Person;
import com.nagarro.remotelearning.util.PersonManager;

public class Main {
    public static void main(String[] args) {
        final String FILE_NAME = "W1P1input.txt";

        PersonManager personManager = new PersonManager();

        personManager.processPerson(FILE_NAME);

        var persons = personManager.GetPersons();

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}