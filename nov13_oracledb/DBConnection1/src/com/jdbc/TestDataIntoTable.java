/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc;

import com.jdbc.domain.Student;
import com.jdbc.service.StudentService;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class TestDataIntoTable {

    static StudentService studentService;

    public static void main(String[] args) {
        studentService = new StudentService();
        Student std = new Student(1005, "Affan Arsalan");

        //studentService.save(std);
        //studentService.update(std);
        //studentService.delete(1002);
        
        //List<Student> stList = studentService.getStudents();
        //for (Student s : stList) {
        //System.out.println("Name: " + s.getName() + " ID: " + s.getId());
        //}
        
        String stname = studentService.getStudent(1001).getName();
        int stid = studentService.getStudent(1001).getId();
        System.out.println("ID: " + stid + " Name: " + stname);
    }
}
