/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nov11_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J2EE-33
 */
public class DBConnection {

    private static final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
    private static final String HOST = "jdbc:oracle:thin:@localhost";
    private static final String PORT = "1521";
    private static Connection connection;
    private static String url = HOST + ":" + PORT + ":";

    public DBConnection() {

    }

    public static Connection getConnection(String dbname, String dbUserName, String dbPass) {
        try {
            connection = DriverManager.getConnection(url + dbname, dbUserName, dbPass);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

}
