/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct16_colorCursor;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author J2EE-33
 */
public class ColorAndCursor {
    public static void main(String[] args) {
        JFrame aWindow = new JFrame("Resized window");
        
        Toolkit theKit = aWindow.getToolkit();
        Dimension winSize = theKit.getScreenSize();
        
        aWindow.setBounds(winSize.width/4,winSize.height/4,winSize.width/2,winSize.height/2);
        
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        aWindow.getContentPane().setBackground(Color.getHSBColor(144, 144, 144));
        aWindow.getContentPane().setForeground(Color.getHSBColor(0, 0, 0));
        aWindow.setVisible(true);
    }
}
