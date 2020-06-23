package Jdbc.companydbwithconnectionmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private volatile static ConnectionManager connectionManager = null;
    private Connection connection = null;

    private ConnectionManager() throws SQLException {

        try {
            DBProperties properties = DBProperties.getInstance();
            Class.forName(properties.getStringProperty("dbDriver"));
            String url = properties.getStringProperty("dbUrl");
            String usr = properties.getStringProperty("user");
            String pwd = properties.getStringProperty("pwd");
            connection = DriverManager.getConnection(url, usr, pwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public synchronized static ConnectionManager getInstance() throws SQLException {
        if (connectionManager == null)
            connectionManager = new ConnectionManager();
        return connectionManager;
    }

    public Connection getConnection() {
        return connection;
    }

    public static void closeConnection() {
        if (connectionManager != null) {
            try {
                connectionManager.connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
