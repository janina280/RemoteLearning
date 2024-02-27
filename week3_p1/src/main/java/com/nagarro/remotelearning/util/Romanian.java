package com.nagarro.remotelearning.util;

import com.nagarro.remotelearning.model.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Romanian extends Person {
    public Romanian(String surname, String firstname, String birthDate) {
        super(surname, firstname);
        this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public Romanian(String fullname, String birthDate) {
        super(fullname);
        this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public void selfDescribe() {
        calculateAge();
        System.out.println(surname+firstname+": Buna,sunt din Romania si imi place sa programez. Varsta mea este de " + age+" de ani");
    }
}
