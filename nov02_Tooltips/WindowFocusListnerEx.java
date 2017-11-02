/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nov02_Tooltips;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author J2EE-33
 */
public class WindowFocusListnerEx {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public WindowFocusListnerEx() {
        preperGUI();
    }

    public static void main(String[] args) {
        WindowFocusListnerEx swingListenerDemo = new WindowFocusListnerEx();
        swingListenerDemo.showFocusListenerDemo();
    }

    private void preperGUI() {
        mainFrame = new JFrame("Java Swing Example");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent winowEvent) {
                System.exit(0);
            }
        });

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showFocusListenerDemo() {
        headerLabel.setText("Listner in action: FocusListener");
        JButton okButton = new JButton("OK");
        JButton cancenButton = new JButton("Cancel");

        okButton.addFocusListener(new CustomFocusListener());
        cancenButton.addFocusListener(new CustomFocusListener());

        controlPanel.add(okButton);
        controlPanel.add(cancenButton);
        mainFrame.setVisible(true);
    }

    class CustomFocusListener implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            statusLabel.setText(statusLabel.getText() + e.getComponent().getClass().getSimpleName() + " Gain Focus. ");
        }

        @Override
        public void focusLost(FocusEvent e) {
            statusLabel.setText(statusLabel.getText() + e.getComponent().getClass().getSimpleName() + " Lost Focus. ");
        }

    }

}
