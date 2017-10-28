/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct28_SketchFrame;

import java.awt.*;

/**
 *
 * @author J2EE-33
 */
public class Sketcher {
    public static void main(String[] args) {
        window = new SketchFrame("Sketcher");
        Toolkit theKit = window.getToolkit();
        Dimension winSize = theKit.getScreenSize();
        
        window.setBounds(winSize.width/4,winSize.height/4,winSize.width/2,winSize.height/2);
        window.setVisible(true);
    }
    private static SketchFrame window;
}
