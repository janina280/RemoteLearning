package com.nagarro.remotelearning.util;

import com.nagarro.remotelearning.model.Person;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    private List<Person> _persons = new ArrayList<>();
    public void processPerson(String fileNameInput) {
        ReadFromFile readFromFile = new ReadFromFile();
        InputStream is = readFromFile.getFileFromResourceAsStream(fileNameInput);

        try (InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {
            String personInfo;

            while ((personInfo = reader.readLine()) != null) {
                var newPerson = getPerson(personInfo);
                _persons.add(newPerson);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public List<Person> GetPersons(){
        return _persons;
    }

    private Person getPerson(String personInfo) {
        final int FIRST_NAME_INDEX = 0;
        final int LAST_NAME_INDEX = 1;
        final int DATE_OF_BIRTH_INDEX = 2;
        final int DATE_OF_DEATH_INDEX = 3;

        String[] personInfoSplit = personInfo.split(", ");

        var firstName = personInfoSplit[FIRST_NAME_INDEX];
        var lastName = personInfoSplit[LAST_NAME_INDEX];
        var dob = personInfoSplit[DATE_OF_BIRTH_INDEX];

        Person person;
        if (personInfoSplit.length >= 4) {
            var dod = personInfoSplit[DATE_OF_DEATH_INDEX];
            person = new Person(firstName, lastName, dob, dod);
        }
        else{
            dob = dob.replace("b.", "");
            person = new Person(firstName, lastName, dob);
        }

        return person;
    }
}
