/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.connection;

import java.sql.Connection;

/**
 *
 * @author J2EE-33
 */
public class ConnectionDB {
    
    public static Connection conn = DBconnectQuery.getConnection("xe", "hr", "hr");
    
    public static void main(String[] args) {
        ConnectionDB connectionDB = new ConnectionDB();
    }
}
