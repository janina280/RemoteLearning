package com.nagarro.remotelearning.util;

public class PalindromeManager {
    public boolean isValid(long number) {
        long reverse;
        long sum = 0;
        long temp;

        temp = number;
        while (number > 0) {
            reverse = number % 10;
            sum = (sum * 10) + reverse;
            number = number / 10;
        }
        return temp == sum;
    }
}
