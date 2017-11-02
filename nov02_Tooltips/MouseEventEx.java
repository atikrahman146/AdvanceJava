/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nov02_Tooltips;

import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author J2EE-33
 */
public class MouseEventEx extends JFrame implements MouseListener {

    Label l;

    public MouseEventEx() {
        addMouseListener(this);
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventEx();
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        l.setText("Mouse is clicked");
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        l.setText("Mouse is Pressed");
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        l.setText("Mouse is Released");
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        l.setText("Mouse is Entered");
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        l.setText("Mouse is Exited");
    }

}
