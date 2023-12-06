package com.nagarro.remotelearning.main;

import com.nagarro.remotelearning.tools.PrimerNumbersPrinter;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Run-> Edit -> Arguments");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            PrimerNumbersPrinter.printNumbersWithPrimes(n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }
}
