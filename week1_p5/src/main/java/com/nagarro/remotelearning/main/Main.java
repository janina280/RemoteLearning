package com.nagarro.remotelearning.main;

import com.nagarro.remotelearning.util.PalindromeFinder;
import com.nagarro.remotelearning.util.PalindromeManager;

public class Main {
    public static void main(String[] args) {
        PalindromeFinder palindromeFinder = new PalindromeFinder();
        PalindromeManager palindromeManager = new PalindromeManager();

        palindromeFinder.findPalindromes(10000019, 109, palindromeManager);
        System.out.println(palindromeFinder.getResults());
    }
}