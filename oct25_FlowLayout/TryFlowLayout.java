/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct25_FlowLayout;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author J2EE-33
 */
public class TryFlowLayout {

    static JFrame aWindow = new JFrame("This is flow title");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();

        Dimension winSize = theKit.getScreenSize();
        aWindow.setBounds(winSize.width / 4, winSize.height / 4, winSize.width / 2, winSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout flow = new FlowLayout(FlowLayout.LEFT,20,30);
        Container content = aWindow.getContentPane();
        content.setLayout(flow);

        for (int i = 0; i <= 6; i++) {
            content.add(new JButton("Press" + i));
            aWindow.setVisible(true);
        }
        aWindow.pack();

    }
}
