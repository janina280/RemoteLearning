package com.nagarro.remotelearning.model;

import com.nagarro.remotelearning.annotation.Logged;

@Logged
public class Rectangle implements Drawable {
    @Logged
    public void draw() {
        System.out.println("Rectangle");
    }

}
