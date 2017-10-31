/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct30_Sketcher;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.SwingUtilities;

/**
 *
 * @author J2EE-33
 */
public class Sketcher {

    private static SketchFrame window;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
            @Override
            public void run() {
                createGUI();
            }
        }
        );
    }

    static void createGUI() {
        window = new SketchFrame("Sketcher");
        Toolkit theKit = window.getToolkit();
        Dimension winSize = theKit.getScreenSize();
        
        window.setBounds(winSize.width / 6, winSize.height / 6, 2 * winSize.width / 3, 2 * winSize.height / 3);
        window.setVisible(true);
    }
;
}
