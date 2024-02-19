package com.nagarro.remotelearning.main;

import com.nagarro.remotelearning.model.Titlelizer;

public class Main {
    public static void main(String[] args) {
        Titlelizer titlelizer = new Titlelizer();
        System.out.println(titlelizer.titlelize("Lorem Ipsum is simply dummy text of the printing and typesetting industry"));
    }
}