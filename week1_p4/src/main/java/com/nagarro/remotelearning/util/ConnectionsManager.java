package com.nagarro.remotelearning.util;

import java.util.ArrayList;
import java.util.List;

public class ConnectionsManager {
    private final List<Connection> _connections = new ArrayList<>();

    public List<Connection> getConnection() {
        if (_connections.isEmpty()) {
            return null;
        } else {
            return _connections;
        }
    }
}