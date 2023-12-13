package com.nagarro.remotelearning.main;

import com.nagarro.remotelearning.util.ConnectionsManager;

public class Main {
    public static void main(String[] args) {
        ConnectionsManager connectionsManager = new ConnectionsManager();
        System.out.println(connectionsManager.getConnection());
    }
}