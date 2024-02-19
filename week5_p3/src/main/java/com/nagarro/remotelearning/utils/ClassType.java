package com.nagarro.remotelearning.utils;

public enum ClassType {
    INITIAL(""),
    RELOADED("MyClass"),
    SUBCLASS("SubClass");
    private final String classType;

    ClassType(String classType) {
        this.classType = classType;
    }
    public String getClassType() {
        return classType;
    }
}