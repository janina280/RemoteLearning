package com.nagarro.remotelearning.util;

public class PalindromeFinder {
    private long totalResults = 0;

    public void findPalindromes(long maxValue, long step, PalindromeManager manager) {
        for (long i = step; i <= maxValue; i += step)
            if (manager.isValid(i)) {
                totalResults++;
            }
    }

    public long getResults() {
        return totalResults;
    }
}
