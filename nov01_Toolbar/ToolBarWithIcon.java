/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nov01_Toolbar;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import static java.awt.event.InputEvent.CTRL_DOWN_MASK;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import javax.swing.Action;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

/**
 *
 * @author J2EE-33
 */
public class ToolBarWithIcon extends JFrame {

    public ToolBarWithIcon(String title) {
        setTitle(title);
        setJMenuBar(menuBar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenu fileMenu = new JMenu("File");
        JMenu elementMenu = new JMenu("Elements");
        fileMenu.setMnemonic('F');
        elementMenu.setMnemonic('E');

        JToolBar toolBar = new JToolBar();
        getContentPane().add(toolBar, BorderLayout.NORTH);

        openAction = new FileAction("Open", KeyStroke.getKeyStroke('O', CTRL_DOWN_MASK));

        openAction.putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("Images/Open.gif")));
        JButton button = new JButton(openAction);
        button.setBorder(BorderFactory.createRaisedBevelBorder());
        toolBar.add(button);

        menuBar.add(fileMenu);
        menuBar.add(elementMenu);
    }

    class FileAction extends AbstractAction {

        FileAction(String name) {
            super(name);
        }

        FileAction(String name, KeyStroke keystroke) {
            this(name);
            if (keystroke != null) {
                putValue(ACCELERATOR_KEY, keystroke);
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private FileAction openAction;
    private JMenuBar menuBar = new JMenuBar();
}
