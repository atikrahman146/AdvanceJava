/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nov01_Toolbar;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

/**
 *
 * @author J2EE-33
 */
public class Icon {
    public Icon(){
        JFrame frame = new JFrame("JToolBar Demo");
        JToolBar toolbar = new JToolBar("Application");
        
        JButton btnCalendar = new JButton(new ImageIcon(getClass().getResource("Images/Open.gif")));
        JButton btnClock = new JButton(new ImageIcon(getClass().getResource("Images/Blue.gif")));
        JButton btnContacts = new JButton(new ImageIcon(getClass().getResource("Images/Yellow.gif")));
        JButton btnGreen = new JButton(new ImageIcon(getClass().getResource("Images/Green.gif")));
        JButton btnLine = new JButton(new ImageIcon(getClass().getResource("Images/Line.gif")));
        
        toolbar.add(btnCalendar);
        toolbar.add(btnClock);
        toolbar.add(btnContacts);
        toolbar.add(btnGreen);
        toolbar.add(btnLine);
        
        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(toolbar,BorderLayout.PAGE_START);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(500, 200);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Icon();
    }
}
