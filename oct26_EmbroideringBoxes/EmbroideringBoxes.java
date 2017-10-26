/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct26_EmbroideringBoxes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author J2EE-33
 */
public class EmbroideringBoxes {

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

        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBorder(new TitledBorder(new EtchedBorder(), "Line Color"));
        leftPanel.add(left, BorderLayout.CENTER);

        Box right = Box.createVerticalBox();

        right.add(Box.createVerticalStrut(30));//invisible height
        right.add(new JCheckBox("Dashed"));

        right.add(Box.createVerticalStrut(30));//invisible height
        right.add(new JCheckBox("Thick"));

        right.add(Box.createVerticalStrut(30));//invisible height
        right.add(new JCheckBox("Rounded"));

        right.add(Box.createVerticalStrut(30));//invisible height
        right.add(Box.createGlue()); //glue at the end to take all space at bottom

        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBorder(new TitledBorder(new EtchedBorder(), "Line Properties"));
        rightPanel.add(right, BorderLayout.CENTER);

        Box top = Box.createHorizontalBox();
        top.add(leftPanel);
        top.add(Box.createHorizontalStrut(5));
        top.add(rightPanel);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBorder(new CompoundBorder(BorderFactory.createLineBorder(Color.black, 1),
                BorderFactory.createBevelBorder(BevelBorder.RAISED)));

        JButton button;
        Border edge = BorderFactory.createRaisedBevelBorder();
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
        BoxLayout box = new BoxLayout(content, BoxLayout.Y_AXIS);

        content.setLayout(box);
        content.add(top);
        content.add(bottomPanel);

        aWindow.pack();
        aWindow.setVisible(true);
    }
}
