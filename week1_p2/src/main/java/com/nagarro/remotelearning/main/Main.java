package com.nagarro.remotelearning.main;

import com.nagarro.remotelearning.util.PrimeNumberManager;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Run with parameters-> Arguments");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            PrimeNumberManager.identifyPrimeNumbers(n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }
}
