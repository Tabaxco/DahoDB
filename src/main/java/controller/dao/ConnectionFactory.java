package controller.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("MySQL Driver not found!", e);
        }
    }

    private static final String LOCAL_URL = "jdbc:mysql://localhost:3306/my_database";

    public static Connection getConnection() {
        String dbUrl = System.getenv("DB_URL");
        String user = System.getenv("DB_USER");
        String pass = System.getenv("DB_PASSWORD");

        try {
            if (dbUrl == null || dbUrl.isEmpty()) {
                dbUrl = LOCAL_URL;
                user = (user == null) ? "root" : user;
                pass = (pass == null) ? "password" : pass;
                System.out.println("Connecting to LOCAL (host) database...");
            } else {
                System.out.println("Connecting to DOCKER database service...");
            }

            return DriverManager.getConnection(dbUrl, user, pass);

        } catch (SQLException e) {
            System.err.println("CRITICAL: Could not connect to the database!");
            e.printStackTrace();
            throw new RuntimeException("Database connection failed", e);
        }
    }
}