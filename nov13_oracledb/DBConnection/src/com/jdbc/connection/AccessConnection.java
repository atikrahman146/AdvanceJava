package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rajail Islam
 */
public class AccessConnection {

    public static void main(String[] args) {
        getAccessConnection();
    }

    public static Connection getAccessConnection() {
        String user = "";
        String pass = "";
        Connection con = null;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\Users\\J2EE-33\\Desktop\\JAVA\\DBConnection\\accessConn.accdb", user, pass);
            System.out.println(":::Connected:::");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
}
