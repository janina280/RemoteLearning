package com.nagarro.remotelearning.main;

import com.nagarro.remotelearning.tools.PalindromeFinder;
import com.nagarro.remotelearning.tools.PalindromeValidator;
import com.nagarro.remotelearning.interfaces.Validator;

public class Main {
    static PalindromeFinder browser = new PalindromeFinder();
    static Validator validator = new PalindromeValidator();

    public static void main(String[] args) {
        browser.findPalindromes(10000019, 109, validator);
        System.out.println(browser.getResults());
    }
}