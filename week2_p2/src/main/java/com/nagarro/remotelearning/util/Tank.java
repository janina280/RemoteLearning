package com.nagarro.remotelearning.util;

import java.util.ArrayList;
import java.util.List;
import java.lang.Object;

public class Tank {
    private final List<Object> stack = new ArrayList<>();

    public void push() {
        stack.add(new Object());
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.remove(stack.size() - 1);
        } else {
            System.out.println("Stack is empty");
        }
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        if (stack.isEmpty()) {
            System.out.println("Can be collected");
        } else {
            System.out.println("Stack is in use");
            return;
        }
     super.finalize();
    }
}
