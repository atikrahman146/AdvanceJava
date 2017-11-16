/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.dao;

import com.jdbc.domain.Student;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public interface StudentDao {

    public void save(Student s);

    public void update(Student s);

    public void delete(int id);

    public List<Student> getStudents();

    public Student getStudent(int id);

}
