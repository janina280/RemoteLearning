package com.nagarro.remotelearning.model;

import com.nagarro.remotelearning.exception.CustomListException;
import java.util.ArrayList;
import java.util.function.IntFunction;

public class StringList implements List<String> {
    private int arraySize = 20;
    private Integer[] values = new Integer[arraySize];
    private int index = 0;
    private final java.util.List<String> recordOfOperations = new ArrayList<>();

    @Override
    public void add(String element) {
        addRecord("add()");
        if (element == null) {
            throw new CustomListException("Null");
        }
        try {
            Integer.parseInt(element);
            if (index == arraySize) {
                resize();
            }
            values[index] = Integer.parseInt(element);
            index++;
            resize();
        } catch (NumberFormatException e) {
            throw new CustomListException("Invalid number.");
        }
    }

    @Override
    public String get(int positon) {
        addRecord("get()");
        if (positon >= index) {
            throw new CustomListException("Index out of bounds.");
        }
        return String.valueOf(values[positon]);
    }

    @Override
    public boolean contains(String element) {
        addRecord("contains()");
        for (Integer value : values) {
            final int elementToSearchFor = Integer.parseInt(element);
            if (value == elementToSearchFor) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(List<String> foreignList) {
        addRecord("containsAll()");
        for (Integer value : values) {
            if (!foreignList.contains(value.toString())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        addRecord("size()");
        return index;
    }

    public String[] getRecords() {
        return recordOfOperations.toArray(new String[recordOfOperations.size()]);
    }

    private void resize() {

        if (index == arraySize) {
            arraySize *= 2;
            Integer[] newArray = new Integer[arraySize];
            System.arraycopy(values, 0, newArray, 0, values.length);
            values = newArray;
        }
    }

    private void addRecord(String record) {
        recordOfOperations.add("called " + record);
    }

}