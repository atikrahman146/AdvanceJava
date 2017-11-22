/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.create;

import static com.jdbc.connection.RunMySqlDBConnection.connMysql;
import static com.jdbc.connection.RunOracleDBconnection.connOracle;
import com.jdbc.service.StudentService;
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
        String sql = "CREATE TABLE studentbd "
                + "(id INTEGER NOT NULL, "
                + "student_name VARCHAR(255), "
                + "PRIMARY KEY (id))";

        try {
            //PreparedStatement pstm = conn.prepareStatement(sql);
            PreparedStatement pstm = connOracle.prepareStatement(sql);
            int i = pstm.executeUpdate();
            System.out.println(i + "table has been updated successfully.");
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
