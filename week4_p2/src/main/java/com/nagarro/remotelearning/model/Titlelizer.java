package com.nagarro.remotelearning.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Titlelizer {
    private static final int FIRST_LETTER_INDEX = 0;
    private static final int START_INDEX = 0;
    private static final String BLANK_SPACE = " ";
    private static final List<String> IGNORED_WORDS = new ArrayList<>(Arrays.asList("the", "a", "to", "in", "of"));

    public String titlelize(String toTitlelize) {
        if (toTitlelize == null) {
            throw new IllegalArgumentException();
        } else if (toTitlelize.equals("")) {
            return "";
        }
        String[] splittedString = toTitlelize.split(BLANK_SPACE);
        String sentence = capitalizeFirstLetterOfEachWord(splittedString);
        return sentence;
    }

    private String capitalizeFirstLetterOfEachWord(String[] splittedString) {
        StringBuilder newString = new StringBuilder();
        for (int i = START_INDEX; i < splittedString.length; i++) {
            if (isNotIgnoredWord(splittedString[i])) {
                newString.append(Character.toUpperCase(splittedString[i].charAt(FIRST_LETTER_INDEX))).append(splittedString[i].substring(1)).append(BLANK_SPACE);
            } else {
                newString.append(splittedString[i]).append(BLANK_SPACE);
            }
        }
        newString.deleteCharAt(newString.length() - 1);
        return newString.toString();
    }
    private boolean isNotIgnoredWord(String word) {
        return !IGNORED_WORDS.contains(word);
    }
}
