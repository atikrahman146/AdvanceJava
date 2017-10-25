/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct25_FlowLayout;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author J2EE-33
 */
public class TryBorderLayout {

    static JFrame aWindow = new JFrame("This is border layout");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension winSize = theKit.getScreenSize();

        aWindow.setBounds(winSize.width / 4, winSize.height / 4, winSize.width / 2, winSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout border = new BorderLayout();
        Container content = aWindow.getContentPane();
        content.setLayout(border);

        EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);
        JButton button;

        content.add(button = new JButton("East"), BorderLayout.EAST);
        button.setBorder(edge);
        content.add(button = new JButton("West"), BorderLayout.WEST);
        button.setBorder(edge);
        content.add(button = new JButton("North"), BorderLayout.NORTH);
        button.setBorder(edge);
        content.add(button = new JButton("South"), BorderLayout.SOUTH);
        button.setBorder(edge);
        content.add(button = new JButton("Center"), BorderLayout.CENTER);
        button.setBorder(edge);

        aWindow.setVisible(true);

    }
}
