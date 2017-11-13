/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc;

import com.jdbc.domain.Employees;
import com.jdbc.query.DataRetrieveService;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class ShowEmployeeTableData {
    public static void main(String[] args) {
        List<Employees> empList = DataRetrieveService.getEmployees();
        
        for (Employees e : empList) {
            System.out.println("ID: " + e.getEmplyee_id() + " Name: " + e.getLastname());
        }
    }
}
