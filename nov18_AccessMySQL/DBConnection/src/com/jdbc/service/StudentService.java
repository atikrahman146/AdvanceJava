/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.service;

import static com.jdbc.connection.RunMySqlDBConnection.connMysql;
import static com.jdbc.connection.RunOracleDBconnection.conn;
import com.jdbc.dao.StudentDao;
import com.jdbc.domain.Student;
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
public class StudentService implements StudentDao {

    @Override
    public void save(Student s) {
        try {
            if (s.getName() != null) {
                PreparedStatement stmt = connMysql.prepareStatement("insert into studentbd(id, student_name) values(?,?)");

                stmt.setInt(1, s.getId());
                stmt.setString(2, s.getName());

                int i = stmt.executeUpdate();

                System.out.println(i + " record inserted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Student s) {
        try {
            if (s.getId() != 0) {
                PreparedStatement stmt = connMysql.prepareStatement("update studentbd set student_name=? where id=?");

                stmt.setString(1, s.getName());
                stmt.setInt(2, s.getId());

                int i = stmt.executeUpdate();

                System.out.println(i + " record updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        try {
            if (id != 0) {
                PreparedStatement stmt = connMysql.prepareStatement("delete from studentbd where id=?");
                stmt.setInt(1, id);
                int i = stmt.executeUpdate();
                System.out.println(i + " record deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        try {
            Student s;
            PreparedStatement stmt = connMysql.prepareStatement("select * from studentbd");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Student getStudent(int id) {
        Student s = null;
        try {
            PreparedStatement stmt = connMysql.prepareStatement("select * from studentbd where id=?");
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

}
