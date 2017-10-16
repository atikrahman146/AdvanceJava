/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct16_FramingWindow;

import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.JFrame;

/**
 *
 * @author J2EE-33
 */
public class CenteredWindow {
    static JFrame aWindow = new JFrame("Title");
    
    public static void main(String[] args) {
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int winWidth = 400;
        int winHeight = 150;
        aWindow.setBounds(center.x-winWidth/2,center.y-winHeight/2,winWidth,winHeight);
        
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
}
