/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nov01_Toolbar;

import java.awt.*;

/**
 *
 * @author J2EE-33
 */
public class ToolBarRun {

    private static ToolBarWithIcon window;

    public static void main(String[] args) {
        window = new ToolBarWithIcon("ToolBar with icon");
        Toolkit theKit = window.getToolkit();
        Dimension winSize = theKit.getScreenSize();

        window.setBounds(winSize.width / 4, winSize.height / 4, winSize.width / 2, winSize.height / 2);
        window.setVisible(true);
    }
}
