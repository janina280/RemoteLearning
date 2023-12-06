package com.nagarro.remotelearning.tools;

import com.nagarro.remotelearning.interfaces.Validator;

public class PalindromeFinder {
    private long totalResults = 0;

    public void findPalindromes(long maxValue, long step, Validator validator) {
        for (long i = step; i <= maxValue; i += step)
            if (validator.isValid(i)) {
                totalResults++;
            }
    }

    public long getResults() {
        return totalResults;
    }
}
