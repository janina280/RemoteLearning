package com.nagarro.remotelearning.tools;

import com.nagarro.remotelearning.tools.Connection;

import java.util.Arrays;
import java.util.List;

public class ConnectionsManager extends Connection {
    private static final int NUMBER_OF_CONNECTIONS = 20;
    private List<Connection> connections = Arrays.asList(new Connection[NUMBER_OF_CONNECTIONS]);


    public Connection getConnection(int connectionNumber) {
        if (connectionNumber >= NUMBER_OF_CONNECTIONS) {
            return null;
        } else {
            if (connections.get(connectionNumber) == null) {
                return new Connection();
            }
            return connections.get(connectionNumber);


        }
    }
}