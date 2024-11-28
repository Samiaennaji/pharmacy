package org.example.pproject.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/pharmacy_db";
    private static final String USER = "root";
    private static final String PASSWORD = "SAM#24#ennaji";
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
