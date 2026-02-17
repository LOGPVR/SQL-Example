package jm.task.core.jdbc.util;

import com.mysql.cj.callback.UsernameCallback;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final static String URL = "jdbc:mysql://localhost:3306/dbstudents";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "0000";

    public static Connection getConnect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection access!");
        } catch (SQLException e) {
            System.out.println("Connection error" + e);;
        }
        return connection;
    }
}
