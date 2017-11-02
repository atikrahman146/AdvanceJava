/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nov02_Tooltips;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author J2EE-33
 */
public class ToolTipExample {
    public ToolTipExample(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel inputLevel = new JLabel("Username");
        inputLevel.setToolTipText("Enter your username");
        JTextField inputText = new JTextField(10);
        inputText.setToolTipText("Add text here");
        
        JButton inputButton = new JButton("Enter");
        inputButton.setToolTipText("Login to admin area");
        
        frame.getContentPane().setLayout(new FlowLayout());
        frame.add(inputLevel);
        frame.getContentPane().add(inputText);
        frame.getContentPane().add(inputButton);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new ToolTipExample();
    }
}
