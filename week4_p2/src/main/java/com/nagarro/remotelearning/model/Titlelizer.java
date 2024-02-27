package com.nagarro.remotelearning.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Titlelizer {
    private static final int START_INDEX = 0;
    private static final String BLANK_SPACE = " ";
    private static final List<String> IGNORED_WORDS = new ArrayList<>(Arrays.asList("the", "a", "to", "in", "of"));

    public String titlelize(String toTitlelize) {
        if (toTitlelize == null) {
            throw new IllegalArgumentException();
        }
        if ("".equals(toTitlelize)){
            return "";
        }
        String[] splittedString = toTitlelize.split(BLANK_SPACE);
        String sentence = capitalizeFirstLetterOfEachWord(splittedString);
        return sentence;
    }

    private String capitalizeFirstLetterOfEachWord(String[] splittedString) {
        StringBuilder newString = new StringBuilder();
        for (int i = START_INDEX; i < splittedString.length; i++) {
            String word = splittedString[i];
            if (isNotIgnoredWord(word)) {
                newString.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(BLANK_SPACE);
            } else {
                newString.append(word).append(BLANK_SPACE);
            }
        }
        newString.deleteCharAt(newString.length() - 1);
        return newString.toString();
    }
    private boolean isNotIgnoredWord(String word) {
        return !IGNORED_WORDS.contains(word);
    }
}
