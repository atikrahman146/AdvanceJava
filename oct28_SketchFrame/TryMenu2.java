/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct28_SketchFrame;

import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author J2EE-33
 */
public class TryMenu2{
    JMenu menu1, menu2;
    JMenuItem item1, item2;

    public TryMenu2() {
        JFrame fs = new JFrame("Try Menu");
        JMenuBar mb = new JMenuBar();
        
        menu1 = new JMenu("File");
        item1 = new JMenuItem("Exit");
        
        item1.setAccelerator(KeyStroke.getKeyStroke('E',InputEvent.CTRL_DOWN_MASK));
        
        mb.add(menu1);
        menu1.add(item1);
        fs.setJMenuBar(mb);

        fs.setSize(400, 400);
        fs.setLayout(null);
        fs.setVisible(true);
    }
    public static void main(String[] args) {
        new TryMenu2();
    }
    
}
