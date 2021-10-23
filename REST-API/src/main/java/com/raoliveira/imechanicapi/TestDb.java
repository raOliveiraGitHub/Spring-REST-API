package com.raoliveira.imechanicapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

/**
 * raOliveira.pt | 22/10/2021
 * Computer Science Engineering
 **/

public class TestDb {

    public static void main(String[] args) {

        String url = "jdbc:mysql://188.251.248.167/cars_db?useSSL=false&serverTimezone=UTC";
//        String url = "jdbc:mariadb://raoliveira.pt:3306/cars_db?useSSL=false&serverTimezone=UTC";
//        String url = "jdbc:mysql://raoliveira.pt/cars_db?enabledTLSProtocols=TLSv1.2";
//        String url = "jdbc:mysql://localhost:3306/cars_db?useSSL=false&serverTimezone=UTC";
        try {
            Connection connection = DriverManager.getConnection(url,
                    "root", "rasosql");
            System.out.println("Success");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}