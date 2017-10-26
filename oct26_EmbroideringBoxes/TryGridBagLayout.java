/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct26_EmbroideringBoxes;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

/**
 *
 * @author J2EE-33
 */
public class TryGridBagLayout {

    static JFrame aWindow = new JFrame("This is a Gridbag Layout");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize = theKit.getScreenSize();

        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        aWindow.getContentPane().setLayout(gridbag);

        constraints.weightx = constraints.weighty = 10.0;
        constraints.fill = constraints.BOTH;
        addButton(" Press ", constraints, gridbag);

        constraints.gridwidth = constraints.REMAINDER;
        addButton("Go", constraints, gridbag);

        //aWindow.pack();
        aWindow.setVisible(true);
    }

    private static void addButton(String label, GridBagConstraints constraints, GridBagLayout layout) {
        Border edge = BorderFactory.createRaisedSoftBevelBorder();
        JButton button = new JButton(label);
        button.setBorder(edge);
        layout.setConstraints(button, constraints);
        aWindow.getContentPane().add(button);
    }
}
