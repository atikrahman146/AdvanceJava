/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct26_EmbroideringBoxes;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Spring;
import javax.swing.SpringLayout;

/**
 *
 * @author J2EE-33
 */
public class TrySpringLayout {

    static JFrame aWindow = new JFrame("This is a Gridbag Layout");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension winSize = theKit.getScreenSize();

        aWindow.setBounds(winSize.width / 6, winSize.height / 6, 2 * winSize.width / 3, 2 * winSize.height / 3);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpringLayout layout = new SpringLayout();
        Container content = aWindow.getContentPane();
        content.setLayout(layout);

        JButton[] buttons = new JButton[6];
        SpringLayout.Constraints constr = null;

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Press" + (i + 1));
            content.add(buttons[i]);
        }

        Spring xSpring = Spring.constant(5, 15, 25);
        Spring ySpring = Spring.constant(10, 30, 50);

        constr = layout.getConstraints(buttons[0]);
        constr.setX(xSpring);
        constr.setY(ySpring);

        for (int i = 1; i < buttons.length; i++) {
            constr = layout.getConstraints(buttons[i]);
            layout.putConstraint(SpringLayout.WEST, buttons[i], xSpring, SpringLayout.EAST, buttons[i - 1]);
            layout.putConstraint(SpringLayout.NORTH, buttons[i], xSpring, SpringLayout.SOUTH, buttons[i - 1]);
        }

        aWindow.setVisible(true);
    }
}
