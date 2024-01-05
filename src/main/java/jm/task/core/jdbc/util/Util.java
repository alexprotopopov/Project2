package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private  final static String DB_DRIVER ="com.mysql.cj.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "password";

    public static Connection getConnection() {
        Connection connection= null;

        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); {
            //    System.out.println("We are connected!");
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("there is no connection... Exception!");
        }
        return connection;
    }
}


