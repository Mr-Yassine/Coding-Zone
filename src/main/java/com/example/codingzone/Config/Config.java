package com.example.codingzone.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class Config {

    public static Connection databaseLink;
    private static String db = "coding_zone_db";
    private static String user = "postgres";
    private static String passwd = "1234";
    private static String url = "jdbc:postgresql://localhost:5432/" + db;

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            databaseLink = DriverManager.getConnection(url, user, passwd);
            //System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return databaseLink;
    }

}
