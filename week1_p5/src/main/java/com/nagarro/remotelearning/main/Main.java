package com.nagarro.remotelearning.main;


import com.nagarro.remotelearning.tools.Interval;
import com.nagarro.remotelearning.tools.PalindromeValidator;
import com.nagarro.remotelearning.tools.Validator;

public class Main {
    static Interval browser = new Interval();
    static Validator validator = new PalindromeValidator();

    public static void main(String[] args) {
        browser.browseOn(100000, 109, validator);
       // browser.browseOn(Long.MAX_VALUE/2,10000019,validator);
        System.out.println(browser.getResults());
    }
}