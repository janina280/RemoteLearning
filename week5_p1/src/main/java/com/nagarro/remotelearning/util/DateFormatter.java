package com.nagarro.remotelearning.util;

import com.nagarro.remotelearning.model.Day;
import com.nagarro.remotelearning.model.Month;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public String formatDate(String date) {
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        int dayOfWeekValue = localDate.getDayOfWeek().getValue();
        int monthValue = localDate.getMonth().getValue();
        String stringBuilder = Day.getDayAtIndex(dayOfWeekValue) + " " +
                Month.getMonthAtIndex(monthValue) + " " +
                localDate.getYear();
        return stringBuilder;

    }
}