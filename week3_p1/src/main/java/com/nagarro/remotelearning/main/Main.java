package com.nagarro.remotelearning.main;

import com.nagarro.remotelearning.util.English;
import com.nagarro.remotelearning.model.Person;
import com.nagarro.remotelearning.util.Romanian;

public class Main {
    public static void main(String[] args) {
        Person romanian = new Romanian("Popescu", "Alexandru Irinel ", "28-03-2003");
        Person english = new English("Thom Alison ", "1998-07-03");
        english.selfDescribe();
        romanian.selfDescribe();
        System.out.println(romanian.getBirthDate());
    }
}