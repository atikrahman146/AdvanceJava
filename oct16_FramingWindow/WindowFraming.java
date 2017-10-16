/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct16_FramingWindow;

import javax.swing.JFrame;

/**
 *
 * @author J2EE-33
 */
public class WindowFraming {
    
    static JFrame aWindow = new JFrame("This is the window title");
    
    public static void main(String[] args) {
        int windowWidth = 400;
        int windowHeight = 150;
        aWindow.setBounds(50, 100, windowWidth, windowHeight);
        
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
    
}
