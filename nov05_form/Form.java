/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nov05_form;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author J2EE-33
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fage = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        fmale = new javax.swing.JRadioButton();
        ffemale = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        freading = new javax.swing.JCheckBox();
        fwriting = new javax.swing.JCheckBox();
        fwalking = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        fround = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fnote = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        fsubmit = new javax.swing.JButton();
        fclear = new javax.swing.JButton();
        fReadFromFile = new javax.swing.JButton();
        femail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        showSuccessMsg = new javax.swing.JLabel();
        fClearTable = new javax.swing.JButton();
        fExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jFTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Registration Form");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        fage.setText("0");
        fage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fageActionPerformed(evt);
            }
        });
        fage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fageKeyPressed(evt);
            }
        });

        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(fmale);
        fmale.setSelected(true);
        fmale.setText("Male");

        buttonGroup1.add(ffemale);
        ffemale.setText("Female");
        ffemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ffemaleActionPerformed(evt);
            }
        });

        jLabel3.setText("Gender");

        freading.setText("Reading");
        freading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freadingActionPerformed(evt);
            }
        });

        fwriting.setText("Writing");

        fwalking.setText("Walking");

        jLabel4.setText("Hobby");

        fround.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Round", "Round 31", "Round 32", "Round 33", "Round 34", "Round 35" }));
        fround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                froundActionPerformed(evt);
            }
        });

        jLabel5.setText("Round");

        fnote.setColumns(20);
        fnote.setRows(5);
        fnote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(fnote);

        jLabel6.setText("Note");

        fsubmit.setText("Add to Table and Write to File");
        fsubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsubmitActionPerformed(evt);
            }
        });

        fclear.setBackground(new java.awt.Color(255, 102, 0));
        fclear.setForeground(new java.awt.Color(255, 255, 255));
        fclear.setText("Clear Field");
        fclear.setBorder(null);
        fclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fclearActionPerformed(evt);
            }
        });

        fReadFromFile.setBackground(new java.awt.Color(255, 153, 51));
        fReadFromFile.setForeground(new java.awt.Color(255, 255, 255));
        fReadFromFile.setText("Read from File");
        fReadFromFile.setBorder(null);
        fReadFromFile.setBorderPainted(false);
        fReadFromFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fReadFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fReadFromFileActionPerformed(evt);
            }
        });

        femail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        femail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femailActionPerformed(evt);
            }
        });

        jLabel7.setText("Email");

        showSuccessMsg.setForeground(new java.awt.Color(102, 102, 0));

        fClearTable.setBackground(new java.awt.Color(255, 51, 0));
        fClearTable.setForeground(new java.awt.Color(255, 255, 255));
        fClearTable.setText("Clear Table");
        fClearTable.setBorder(null);
        fClearTable.setBorderPainted(false);
        fClearTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fClearTableActionPerformed(evt);
            }
        });

        fExit.setText("Exit");
        fExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel7)))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fmale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ffemale)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fage, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(femail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showSuccessMsg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fround, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(freading)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fwriting)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fwalking)))
                                .addGap(0, 100, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(fReadFromFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(1, 1, 1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(fClearTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(fsubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(25, 25, 25))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(femail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fmale)
                    .addComponent(ffemale)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(freading)
                    .addComponent(fwriting)
                    .addComponent(fwalking)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fround, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(11, 11, 11)
                .addComponent(showSuccessMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fReadFromFile, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fClearTable, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fclear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jFTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Email", "Gender", "Hobby", "Round", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jFTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jFTable);
        if (jFTable.getColumnModel().getColumnCount() > 0) {
            jFTable.getColumnModel().getColumn(4).setPreferredWidth(250);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void femailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femailActionPerformed

    private void fReadFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fReadFromFileActionPerformed
        // TODO add your handling code here:
        String columns[] = {"Name", "Age", "Email", "Gender", "Hobby", "Round", "Note"};
        DefaultTableModel tableModel;
        // table with 7 columns
        tableModel = new DefaultTableModel(0, 7);
        tableModel.setColumnIdentifiers(columns);
        jFTable.setModel(tableModel);
        Utils.displayStudentsdataFromFile("student", tableModel);
    }//GEN-LAST:event_fReadFromFileActionPerformed

    private void fclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fclearActionPerformed
        // TODO add your handling code here:
        fname.setText("");
        fage.setText("");
        femail.setText("");
        buttonGroup1.clearSelection();
        freading.setSelected(false);
        fwriting.setSelected(false);
        fwalking.setSelected(false);
        fround.setSelectedIndex(0);
        fnote.setText("");
    }//GEN-LAST:event_fclearActionPerformed

    private void fsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsubmitActionPerformed
        // TODO add your handling code here:
        String name = "", age = "", email = "", gender = "", hobby = "", round = "", note = "";

        if (fname.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, "Enter your Name");

        } else if (Integer.parseInt(fage.getText()) < 18 || Integer.parseInt(fage.getText()) > 72) {
            JOptionPane.showMessageDialog(null, "Enter valid Age, between 18 - 71.");

        } else if (!checkEmailValidity(femail.getText()) || femail.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, "Enter Email");

        } else if (buttonGroup1.getSelection().isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Select a Gender");

        } else if (!freading.isSelected() && !fwriting.isSelected() && !fwalking.isSelected()) {
            JOptionPane.showMessageDialog(null, "Select Hobby");

        } else if ("Select Round".equals(fround.getItemAt(fround.getSelectedIndex()))) {
            JOptionPane.showMessageDialog(null, "Select Round");

        } else if (fnote.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "Enter Note");

        } else {
            name = fname.getText();
            age = fage.getText();
            email = femail.getText();

            gender = "";
            if (fmale.isSelected()) {
                gender = fmale.getText();
            }
            if (ffemale.isSelected()) {
                gender = ffemale.getText();
            }
            hobby = "";
            if (freading.isSelected()) {
                hobby += freading.getText() + " ";
            }
            if (fwriting.isSelected()) {
                hobby += fwriting.getText() + " ";
            }
            if (fwalking.isSelected()) {
                hobby += fwalking.getText() + " ";
            }
            round = fround.getItemAt(fround.getSelectedIndex());

            note = fnote.getText();

            Student student = new Student(name, Integer.parseInt(age), email, gender, hobby, round, note);
            List<Student> studentsList = new ArrayList<>();
            studentsList.add(student);

            DefaultTableModel model = (DefaultTableModel) jFTable.getModel();
            Object[] col = new Object[7];

            for (int i = 0; i < studentsList.size(); i++) {
                col[0] = studentsList.get(i).getName();
                col[1] = studentsList.get(i).getAge();
                col[2] = studentsList.get(i).getEmail();
                col[3] = studentsList.get(i).getGender();
                col[4] = studentsList.get(i).getHobby();
                col[5] = studentsList.get(i).getRound();
                col[6] = studentsList.get(i).getNote();

                model.addRow(col);

                try {
                    Utils.writeTofile("student", studentsList);
                } catch (Exception ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            showSuccessMsg.setText("Successfully Added into Table and Write to File");

            /*
            Object[] obj = new Object[]{name, age, email, gender, hobby, round, note};
            for (Student s : studentsList) {
                model.addRow(obj);
                try {
                    Utils.writeTofile("student", studentsList);
                } catch (Exception ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
             */
        }

        //this.setVisible(false);
        //new Dashboard().setVisible(true);
    }//GEN-LAST:event_fsubmitActionPerformed

    public boolean checkEmailValidity(String email) {
        if (null != email) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);

            if (!matcher.matches()) {
                return false;
            }
            return true;
        }
        return false;
    }

    private void ffemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ffemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ffemaleActionPerformed

    private void fageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fageActionPerformed

    private void freadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freadingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_freadingActionPerformed

    private void froundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_froundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_froundActionPerformed

    private void fClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fClearTableActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jFTable.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_fClearTableActionPerformed

    private void fExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_fExitActionPerformed

    private void jFTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFTableMouseClicked
        // TODO add your handling code here:
        int i = jFTable.getSelectedRow();
        TableModel model = jFTable.getModel();
        fname.setText(model.getValueAt(i, 0).toString());
        fage.setText(model.getValueAt(i, 1).toString());
        femail.setText(model.getValueAt(i, 2).toString());

        //For radio Button
        String gender = model.getValueAt(i, 3).toString();

        if (gender.equals("Male")) {
            fmale.setSelected(true);
        } else {
            fmale.setSelected(false);
        }
        if (gender.equals("Female")) {
            ffemale.setSelected(true);
        } else {
            ffemale.setSelected(false);
        }

        //checkbox
        String hobby = model.getValueAt(i, 4).toString();
        if (hobby.contains("Reading")) {
            freading.setSelected(true);
        } else {
            freading.setSelected(false);
        }
        if (hobby.contains("Writing")) {
            fwriting.setSelected(true);
        } else {
            fwriting.setSelected(false);
        }
        if (hobby.contains("Walking")) {
            fwalking.setSelected(true);
        } else {
            fwalking.setSelected(false);
        }

        String round = model.getValueAt(i, 5).toString();
        fround.setSelectedItem(round);

        //  cmbCountry.setSelectedIndex(i);
        fnote.setText(model.getValueAt(i, 6).toString());

    }//GEN-LAST:event_jFTableMouseClicked

    private void fageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fageKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (Character.isAlphabetic(ch)) {
            JOptionPane.showMessageDialog(null, "Only numbers are allowed!");
            fage.setText("0");
        }
    }//GEN-LAST:event_fageKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JButton fClearTable;
    public javax.swing.JButton fExit;
    public javax.swing.JButton fReadFromFile;
    public javax.swing.JTextField fage;
    public javax.swing.JButton fclear;
    public javax.swing.JTextField femail;
    public javax.swing.JRadioButton ffemale;
    public javax.swing.JRadioButton fmale;
    public javax.swing.JTextField fname;
    public javax.swing.JTextArea fnote;
    public javax.swing.JCheckBox freading;
    public javax.swing.JComboBox<String> fround;
    public javax.swing.JButton fsubmit;
    public javax.swing.JCheckBox fwalking;
    public javax.swing.JCheckBox fwriting;
    public javax.swing.JTable jFTable;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel showSuccessMsg;
    // End of variables declaration//GEN-END:variables
}
