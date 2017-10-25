/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct25_FlowLayout;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.BevelBorder;

/**
 *
 * @author J2EE-33
 */
public class TryApplet extends JApplet{
    @Override
    public void init(){
        Container content = getContentPane();
        content.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        JButton button;
        Font[] fonts = {new Font("Serif", Font.ITALIC, 14),new Font("Dialog", Font.PLAIN, 14)};
        
        BevelBorder edge = new BevelBorder(BevelBorder.RAISED);
        
        for (int i = 1; i <= 6; i++) {
            content.add(button = new JButton("Press" + i));
            button.setFont(fonts[i%2]);
            button.setBorder(edge);
        }
    }
}
