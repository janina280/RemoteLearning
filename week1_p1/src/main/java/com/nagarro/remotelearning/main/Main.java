package com.nagarro.remotelearning.main;

import com.nagarro.remotelearning.model.Person;
import com.nagarro.remotelearning.tools.ReadFromFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadFromFile readFromFile = new ReadFromFile();

        String fileName = "W1P1input.txt";

        Set<Person> persons = new HashSet<>();

        InputStream is = readFromFile.getFileFromResourceAsStream(fileName);

        try (InputStreamReader streamReader =
                     new InputStreamReader(is, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {

            String string;
            while ((string = reader.readLine()) != null) {
                Person newPerson = new Person(string);
                persons.add(newPerson);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Displaying information about people on the console
        for (Person p : persons) {
            System.out.println(p.toString());
        }
    }
}