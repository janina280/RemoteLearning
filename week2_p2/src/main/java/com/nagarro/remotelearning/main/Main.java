package com.nagarro.remotelearning.main;

import com.nagarro.remotelearning.util.Tank;

public class Main {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        tank1.push();
        tank1.push();
      //  tank1.push();
        tank1.pop();
        tank1.pop();
        tank1 = null;
        System.gc();

    }
}