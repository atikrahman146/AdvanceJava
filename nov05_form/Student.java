/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nov05_form;

/**
 *
 * @author J2EE-33
 */
public class Student {

    private String name, email, gender, hobby, round, note;
    private int age;

    public Student() {
    }

    public Student(String name, int age, String email, String gender, String hobby, String round, String note) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    public String getRound() {
        return round;
    }

    public String getNote() {
        return note;
    }

}
