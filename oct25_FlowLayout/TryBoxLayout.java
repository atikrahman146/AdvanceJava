/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct25_FlowLayout;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author J2EE-33
 */
public class TryBoxLayout {

    static JFrame aWindow = new JFrame("This is grid layout");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension winSize = theKit.getScreenSize();

        aWindow.setBounds(winSize.width / 4, winSize.height / 4, winSize.width / 2, winSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Box left = Box.createVerticalBox();
        left.add(Box.createVerticalStrut(30));//invisible height
        
        ButtonGroup radioGroup = new ButtonGroup();
        JRadioButton rbutton;

        radioGroup.add(rbutton = new JRadioButton("Red"));
        left.add(rbutton);
        left.add(Box.createVerticalStrut(30));
        
        radioGroup.add(rbutton = new JRadioButton("Green"));
        left.add(rbutton);
        left.add(Box.createVerticalStrut(30));

        radioGroup.add(rbutton = new JRadioButton("Blue"));
        left.add(rbutton);
        left.add(Box.createVerticalStrut(30));//invisible height
        radioGroup.add(rbutton = new JRadioButton("Yellow"));
        
        left.add(rbutton);
        left.add(Box.createVerticalStrut(30));//invisible height
        left.add(Box.createGlue()); //glue at the end to take all space at bottom
        
        Box right = Box.createVerticalBox();
        
        right.add(Box.createVerticalStrut(30));//invisible height
        right.add(new JCheckBox("Dashed"));
        
        right.add(Box.createVerticalStrut(30));//invisible height
        right.add(new JCheckBox("Thick"));
        
        right.add(Box.createVerticalStrut(30));//invisible height
        right.add(new JCheckBox("Rounded"));
        
        right.add(Box.createVerticalStrut(30));//invisible height
        right.add(Box.createGlue()); //glue at the end to take all space at bottom
        
        
        Box top = Box.createHorizontalBox();
        top.add(left);
        top.add(right);

        JPanel bottomPanel = new JPanel();
        Border edge = BorderFactory.createRaisedBevelBorder();
        JButton button;

        Dimension size = new Dimension(80, 20);
        bottomPanel.add(button = new JButton("Defaults"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        bottomPanel.add(button = new JButton("OK"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        bottomPanel.add(button = new JButton("Cancel"));
        button.setBorder(edge);
        button.setPreferredSize(size);

        Container content = aWindow.getContentPane();
        content.setLayout(new BorderLayout());
        content.add(top, BorderLayout.CENTER);
        content.add(bottomPanel, BorderLayout.SOUTH);

        aWindow.pack();
        aWindow.setVisible(true);
    }
}
