package com.nagarro.remotelearning.week1_p2.tools;

public class PrimerNumbersPrinter {

        public static void printNumbersWithPrimes(int n) {
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
