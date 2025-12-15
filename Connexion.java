package com.mycompany.cabinet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connexion {
   private static final String URL = "jdbc:mysql://localhost:3306/cabinet_medical?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie !");
        return connexion;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erreur connexion : " );
            e.printStackTrace();
            return null;
        }
    }
}

