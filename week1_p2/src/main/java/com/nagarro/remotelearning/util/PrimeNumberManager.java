package com.nagarro.remotelearning.util;

public class PrimeNumberManager {
    public static void identifyPrimeNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + "-PRIME");
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}