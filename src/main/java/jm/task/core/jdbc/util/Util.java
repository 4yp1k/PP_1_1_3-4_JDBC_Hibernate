package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private final static String URL = "jdbc:mysql://localhost:3306/usersdb";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "Ivan132006.";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (
                SQLException e) {
            System.out.println("there is no connection... Exception!");
        }

        return connection;
    }
}
