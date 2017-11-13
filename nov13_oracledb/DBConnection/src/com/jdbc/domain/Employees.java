/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.domain;

/**
 *
 * @author J2EE-33
 */
public class Employees {
    private int emplyee_id;
    private String lastname;

    public Employees() {
    }

    public Employees(int emplyee_id, String lastname) {
        this.emplyee_id = emplyee_id;
        this.lastname = lastname;
    }

    public int getEmplyee_id() {
        return emplyee_id;
    }

    public void setEmplyee_id(int emplyee_id) {
        this.emplyee_id = emplyee_id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}
