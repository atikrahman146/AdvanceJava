/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct28_SketchFrame;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author J2EE-33
 */
public class TryMenu extends JFrame{

    JMenu menu1, menu2, submenu, submenuItem2;
    JMenuItem item1, item2, item3, submenuItem3,childsummenu1,childsummenu2;

    TryMenu() {
        JFrame fs = new JFrame("Try menu");
        JMenuBar mb = new JMenuBar();

        menu1 = new JMenu("File");
            item1 = new JMenuItem("Open");
            item2 = new JMenuItem("New");
            item3 = new JMenuItem("Close");
            
        menu2 = new JMenu("Elements");
            submenu = new JMenu("Submenu");
                submenuItem2 = new JMenu("submenuItem2");
                    childsummenu1 = new JMenuItem("childsummenu1");
                    childsummenu2 = new JMenuItem("childsummenu2");
                submenuItem3 = new JMenuItem("submenuItem3");

        mb.add(menu1);
        mb.add(menu2);
            menu2.add(submenu);
                submenu.add(submenuItem2);

        menu1.add(item1);
        menu1.addSeparator();
        menu1.add(item2);
        menu1.addSeparator();
        menu1.add(item3);

        submenu.add(submenuItem2);
        submenu.addSeparator();
        submenu.add(submenuItem3);
        
        submenuItem2.add(childsummenu1);
        submenuItem2.addSeparator();
        submenuItem2.add(childsummenu2);

        fs.setJMenuBar(mb);

        fs.setSize(400, 400);
        fs.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        fs.setVisible(true);
    }

    public static void main(String[] args) {
        new TryMenu();
    }
}
