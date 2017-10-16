/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct16_FramingWindow;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
/**
 *
 * @author J2EE-33
 */
public class SIzingWindow {
    static JFrame aWindow = new JFrame("This is a title window");
    
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension windowSize = theKit.getScreenSize();
        
        aWindow.setBounds(windowSize.width/4,windowSize.height/4,windowSize.width/2,windowSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
}
