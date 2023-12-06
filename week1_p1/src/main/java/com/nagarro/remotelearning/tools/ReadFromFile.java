package com.nagarro.remotelearning.tools;

import java.io.*;

public class ReadFromFile {


    public InputStream getFileFromResourceAsStream(String fileName) {

        //creating 'classLoader' object
        ClassLoader classLoader = getClass().getClassLoader();

        //input stream for the specified file
        InputStream inputStream = classLoader.getResourceAsStream(fileName);


        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }

    }

}