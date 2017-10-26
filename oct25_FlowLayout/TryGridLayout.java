/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct25_FlowLayout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author J2EE-33
 */
public class TryGridLayout {
    static JFrame aWindow =  new JFrame("This is grid layout");
    
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension winSize = theKit.getScreenSize();
        
        aWindow.setBounds(winSize.width/4, winSize.height/4, winSize.width/2, winSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout grid = new GridLayout(3,4,30,20);
        Container content = aWindow.getContentPane();
        content.setLayout(grid);
        
        EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);
        
        JButton button = null;
        for (int i = 1; i <= 12; i++) {
            content.add(button = new JButton("Press " + i));
            button.setBorder(edge);
        }
        
        aWindow.pack();
        aWindow.setVisible(true);
    }
}
