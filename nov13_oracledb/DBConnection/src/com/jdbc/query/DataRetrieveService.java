/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.query;

import static com.jdbc.connection.ConnectionDB.conn;
import com.jdbc.domain.Employees;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J2EE-33
 */
public class DataRetrieveService {

    public static List<Employees> getEmployees() {
        List<Employees> list = new ArrayList<>();

        try {
            Employees employee;
            PreparedStatement stmt = conn.prepareStatement("select * from employees");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                employee = new Employees();
                employee.setEmplyee_id(rs.getInt(1));
                employee.setLastname(rs.getString(2));

                list.add(employee);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataRetrieveService.class.getName()).log(Level.SEVERE, null, ex);

        }
        return list;
    }
}
