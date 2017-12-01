/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nov05_form;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author J2EE-33
 */
class Utils {

    //public static void main(String[] args) throws Exception {
    //List<Student> list = new ArrayList<>();
    //list.add(new Student("Reza", 37, "email", "Male", "Coding", "19", "okkkkkkkkk"));
    //writeTofile("student_infox", list);
    //}
    public static void writeTofile(String filename, List<Student> students) {
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) {
                destFile.createNewFile();
            }
            PrintWriter printFile = new PrintWriter(new FileWriter(destFile, true));
            for (Student student : students) {
                printFile.append(student.getName() + ", " + student.getAge() + ", " + student.getEmail() + ", " + student.getGender() + ", " + student.getHobby() + ", " + student.getRound() + ", " + student.getNote() + "\n");
            }
            printFile.close();

        } catch (IOException e) {
            System.err.println("Could not log");
        }
    }

    public static void displayStudentsdataFromFile(String filename, DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));
            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(", "));
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Buffered Reader issue.");
        }
    }
}
