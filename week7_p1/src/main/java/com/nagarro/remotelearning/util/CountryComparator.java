package com.nagarro.remotelearning.util;

import com.nagarro.remotelearning.util.Country;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {
    @Override
    public int compare(Country country1, Country country2) {
        return String.CASE_INSENSITIVE_ORDER.compare(country1.getCapital(), country2.getCapital());
    }
}