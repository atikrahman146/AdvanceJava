/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.create;

import static com.jdbc.connection.ConnectionDB.conn;
import com.jdbc.query.DataRetrieveService;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J2EE-33
 */
public class CreateTable {

    public static void main(String[] args) {
        String sql ="CREATE TABLE studentbd " + 
                    "(id INTEGER NOT NULL, " + 
                    "student_name VARCHAR(255), " + 
                    "PRIMARY KEY (id))";
        
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            int i = pstm.executeUpdate();
            System.out.println( i + "table has been updated successfully.");
        } catch (SQLException ex) {
            Logger.getLogger(DataRetrieveService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
