/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.thedrinkinggame;

import java.util.ArrayList;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
public class THEDrinkingGameMainPage extends javax.swing.JFrame {
    private int playerCounter = 0;
    List<String> players = new ArrayList<String>();  
    /**
     * Creates new form THEDrinkingGameMainPage
     */
    public THEDrinkingGameMainPage() {
        initComponents();
        PlayerTxtFld3.setVisible(false);
        PlayerTxtFld5.setVisible(false);
        PlayerTxtFld4.setVisible(false);
        PlayerLbl3.setVisible(false);
        PlayerLbl4.setVisible(false);
        PlayerLbl5.setVisible(false);
        setLocationRelativeTo(null);
    }
    
    public class NoMorePlayerPlace{
        JFrame Warning;
        NoMorePlayerPlace()
        {
            Warning = new JFrame();
            JOptionPane.showMessageDialog(Warning,"Nem lehet több játékossst hozzáadni!","Figyelmeztetés",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public class NotEnoughPlayer{
        JFrame Error;
        NotEnoughPlayer()
        {
            Error = new JFrame();
            JOptionPane.showMessageDialog(Error,"A kezdéshez minimum 2 játékos szükséges!","Hiba",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public class MinimumPlayer{
        JFrame Error;
        MinimumPlayer()
        {
            Error = new JFrame();
            JOptionPane.showMessageDialog(Error,"Nem lehet 2-nél kevesebb játékos!","Hiba",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NavigatorTbbdPn = new javax.swing.JTabbedPane();
        MainPnl = new javax.swing.JPanel();
        PlayerTxtFld1 = new javax.swing.JTextField();
        PlayerTxtFld2 = new javax.swing.JTextField();
        PlayerTxtFld3 = new javax.swing.JTextField();
        PlayerTxtFld4 = new javax.swing.JTextField();
        PlayerTxtFld5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AddBttn = new javax.swing.JButton();
        StartBttn = new javax.swing.JButton();
        PlayerLbl1 = new javax.swing.JLabel();
        PlayerLbl3 = new javax.swing.JLabel();
        PlayerLbl4 = new javax.swing.JLabel();
        PlayerLbl2 = new javax.swing.JLabel();
        PlayerLbl5 = new javax.swing.JLabel();
        MinusPalyerBttn = new javax.swing.JButton();
        TruthOrDarePnl = new javax.swing.JPanel();
        RandomNameLbl1 = new javax.swing.JLabel();
        TruthBttn = new javax.swing.JButton();
        DareBttn = new javax.swing.JButton();
        OrLbl = new javax.swing.JLabel();
        CurrentTaskPnl = new javax.swing.JPanel();
        SummaryPagePnl = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AZ ivós játék");
        setBackground(new java.awt.Color(204, 0, 0));
        setName("MainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(650, 580));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NavigatorTbbdPn.setMaximumSize(new java.awt.Dimension(650, 700));

        MainPnl.setBackground(new java.awt.Color(102, 37, 73));
        MainPnl.setMaximumSize(new java.awt.Dimension(650, 580));
        MainPnl.setPreferredSize(new java.awt.Dimension(650, 580));

        PlayerTxtFld3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerTxtFld3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 188, 185));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AZ ivós játék");

        AddBttn.setBackground(new java.awt.Color(174, 68, 90));
        AddBttn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AddBttn.setForeground(new java.awt.Color(29, 26, 57));
        AddBttn.setText("+");
        AddBttn.setAlignmentX(0.5F);
        AddBttn.setBorder(null);
        AddBttn.setMaximumSize(new java.awt.Dimension(40, 40));
        AddBttn.setMinimumSize(new java.awt.Dimension(35, 35));
        AddBttn.setPreferredSize(new java.awt.Dimension(40, 40));
        AddBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBttnActionPerformed(evt);
            }
        });

        StartBttn.setBackground(new java.awt.Color(174, 68, 90));
        StartBttn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        StartBttn.setForeground(new java.awt.Color(29, 26, 57));
        StartBttn.setText("Kezdjük!");
        StartBttn.setMaximumSize(new java.awt.Dimension(130, 40));
        StartBttn.setMinimumSize(new java.awt.Dimension(130, 40));
        StartBttn.setPreferredSize(new java.awt.Dimension(130, 40));
        StartBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBttnActionPerformed(evt);
            }
        });

        PlayerLbl1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PlayerLbl1.setForeground(new java.awt.Color(232, 188, 185));
        PlayerLbl1.setText("Játékos 1");

        PlayerLbl3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PlayerLbl3.setForeground(new java.awt.Color(232, 188, 185));
        PlayerLbl3.setText("Játékos 3");

        PlayerLbl4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PlayerLbl4.setForeground(new java.awt.Color(232, 188, 185));
        PlayerLbl4.setText("Játékos 4");

        PlayerLbl2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PlayerLbl2.setForeground(new java.awt.Color(232, 188, 185));
        PlayerLbl2.setText("Játékos 2");

        PlayerLbl5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PlayerLbl5.setForeground(new java.awt.Color(232, 188, 185));
        PlayerLbl5.setText("Játékos 5");

        MinusPalyerBttn.setBackground(new java.awt.Color(174, 68, 90));
        MinusPalyerBttn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MinusPalyerBttn.setForeground(new java.awt.Color(29, 26, 57));
        MinusPalyerBttn.setText("-");
        MinusPalyerBttn.setToolTipText("");
        MinusPalyerBttn.setAlignmentX(0.5F);
        MinusPalyerBttn.setBorder(null);
        MinusPalyerBttn.setMaximumSize(new java.awt.Dimension(40, 40));
        MinusPalyerBttn.setMinimumSize(new java.awt.Dimension(35, 35));
        MinusPalyerBttn.setPreferredSize(new java.awt.Dimension(40, 40));
        MinusPalyerBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusPalyerBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPnlLayout = new javax.swing.GroupLayout(MainPnl);
        MainPnl.setLayout(MainPnlLayout);
        MainPnlLayout.setHorizontalGroup(
            MainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPnlLayout.createSequentialGroup()
                .addGroup(MainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPnlLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(StartBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPnlLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(AddBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MinusPalyerBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPnlLayout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(MainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlayerLbl1)
                            .addComponent(PlayerTxtFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerLbl3)
                            .addComponent(PlayerLbl4)
                            .addComponent(PlayerLbl5)
                            .addComponent(PlayerTxtFld4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerTxtFld2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerLbl2)
                            .addComponent(PlayerTxtFld3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerTxtFld5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPnlLayout.createSequentialGroup()
                .addGap(0, 120, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        MainPnlLayout.setVerticalGroup(
            MainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(PlayerLbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayerTxtFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayerLbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayerTxtFld2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayerLbl3)
                .addGap(4, 4, 4)
                .addComponent(PlayerTxtFld3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayerLbl4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayerTxtFld4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayerLbl5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayerTxtFld5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(MainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinusPalyerBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(StartBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );

        NavigatorTbbdPn.addTab("tab1", MainPnl);

        TruthOrDarePnl.setBackground(new java.awt.Color(102, 37, 73));

        RandomNameLbl1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        RandomNameLbl1.setForeground(new java.awt.Color(232, 188, 185));
        RandomNameLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TruthBttn.setBackground(new java.awt.Color(174, 68, 90));
        TruthBttn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TruthBttn.setForeground(new java.awt.Color(243, 159, 90));
        TruthBttn.setText("Felelsz");
        TruthBttn.setMaximumSize(new java.awt.Dimension(300, 100));
        TruthBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TruthBttnActionPerformed(evt);
            }
        });

        DareBttn.setBackground(new java.awt.Color(174, 68, 90));
        DareBttn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        DareBttn.setForeground(new java.awt.Color(69, 25, 82));
        DareBttn.setText("Mersz");
        DareBttn.setMaximumSize(new java.awt.Dimension(300, 100));

        OrLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        OrLbl.setForeground(new java.awt.Color(232, 188, 185));
        OrLbl.setText("VAGY");

        javax.swing.GroupLayout TruthOrDarePnlLayout = new javax.swing.GroupLayout(TruthOrDarePnl);
        TruthOrDarePnl.setLayout(TruthOrDarePnlLayout);
        TruthOrDarePnlLayout.setHorizontalGroup(
            TruthOrDarePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TruthOrDarePnlLayout.createSequentialGroup()
                .addGroup(TruthOrDarePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TruthOrDarePnlLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(TruthOrDarePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DareBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TruthBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TruthOrDarePnlLayout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(OrLbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TruthOrDarePnlLayout.createSequentialGroup()
                .addGap(0, 121, Short.MAX_VALUE)
                .addComponent(RandomNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        TruthOrDarePnlLayout.setVerticalGroup(
            TruthOrDarePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TruthOrDarePnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(RandomNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(TruthBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(OrLbl)
                .addGap(53, 53, 53)
                .addComponent(DareBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        NavigatorTbbdPn.addTab("tab2", TruthOrDarePnl);

        javax.swing.GroupLayout CurrentTaskPnlLayout = new javax.swing.GroupLayout(CurrentTaskPnl);
        CurrentTaskPnl.setLayout(CurrentTaskPnlLayout);
        CurrentTaskPnlLayout.setHorizontalGroup(
            CurrentTaskPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        CurrentTaskPnlLayout.setVerticalGroup(
            CurrentTaskPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        NavigatorTbbdPn.addTab("tab3", CurrentTaskPnl);

        javax.swing.GroupLayout SummaryPagePnlLayout = new javax.swing.GroupLayout(SummaryPagePnl);
        SummaryPagePnl.setLayout(SummaryPagePnlLayout);
        SummaryPagePnlLayout.setHorizontalGroup(
            SummaryPagePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        SummaryPagePnlLayout.setVerticalGroup(
            SummaryPagePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        NavigatorTbbdPn.addTab("tab4", SummaryPagePnl);

        getContentPane().add(NavigatorTbbdPn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -35, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayerTxtFld3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerTxtFld3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayerTxtFld3ActionPerformed

    private void AddBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBttnActionPerformed
        //Játékos név mező hozzáadása
            playerCounter++;

           switch (playerCounter) {
               case 1:
                   PlayerLbl3.setVisible(true);
                   PlayerTxtFld3.setVisible(true);
                   break;
               case 2:
                   PlayerLbl4.setVisible(true);
                   PlayerTxtFld4.setVisible(true);
                   break;
               case 3:
                   PlayerLbl5.setVisible(true);
                   PlayerTxtFld5.setVisible(true);
                   break;
               default:
                   new NoMorePlayerPlace();
                   break;
                }
    }//GEN-LAST:event_AddBttnActionPerformed

    private void StartBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBttnActionPerformed
        if(!PlayerTxtFld1.getText().isEmpty() && !PlayerTxtFld2.getText().isEmpty())
        {
            switch(playerCounter)
            {
                default:
                    players.add(PlayerTxtFld1.getText());
                    players.add(PlayerTxtFld2.getText());
                    break;
                case 1:
                    players.add(PlayerTxtFld1.getText());
                    players.add(PlayerTxtFld2.getText());
                    players.add(PlayerTxtFld3.getText());
                    break;
                case 2:
                    players.add(PlayerTxtFld1.getText());
                    players.add(PlayerTxtFld2.getText());
                    players.add(PlayerTxtFld3.getText());
                    players.add(PlayerTxtFld4.getText());
                    break;
                case 3:
                    players.add(PlayerTxtFld1.getText());
                    players.add(PlayerTxtFld2.getText());
                    players.add(PlayerTxtFld3.getText());
                    players.add(PlayerTxtFld4.getText());
                    players.add(PlayerTxtFld5.getText());
                    break;
            }
            
            NavigatorTbbdPn.setSelectedIndex(1);
            
            Random r = new Random();
            int randomItem = r.nextInt(players.size());
            String randomPlayer = players.get(randomItem);
            
            RandomNameLbl1.setText(randomPlayer);
        }
        else
            new NotEnoughPlayer();
    }//GEN-LAST:event_StartBttnActionPerformed

    private void TruthBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TruthBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TruthBttnActionPerformed

    private void MinusPalyerBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusPalyerBttnActionPerformed
            playerCounter--;

            switch (playerCounter) {
                case 3:
                    PlayerLbl5.setVisible(false);
                    PlayerTxtFld5.setVisible(false);
                    break;
                case 2:
                    PlayerLbl4.setVisible(false);
                    PlayerTxtFld4.setVisible(false);
                    break;
                case 1:
                    PlayerLbl3.setVisible(false);
                    PlayerTxtFld3.setVisible(false);
                    break;
                default:
                    new MinimumPlayer();
                    break;
                }
    }//GEN-LAST:event_MinusPalyerBttnActionPerformed

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
            java.util.logging.Logger.getLogger(THEDrinkingGameMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(THEDrinkingGameMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(THEDrinkingGameMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(THEDrinkingGameMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new THEDrinkingGameMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBttn;
    private javax.swing.JPanel CurrentTaskPnl;
    private javax.swing.JButton DareBttn;
    private javax.swing.JPanel MainPnl;
    private javax.swing.JButton MinusPalyerBttn;
    private javax.swing.JTabbedPane NavigatorTbbdPn;
    private javax.swing.JLabel OrLbl;
    private javax.swing.JLabel PlayerLbl1;
    private javax.swing.JLabel PlayerLbl2;
    private javax.swing.JLabel PlayerLbl3;
    private javax.swing.JLabel PlayerLbl4;
    private javax.swing.JLabel PlayerLbl5;
    private javax.swing.JTextField PlayerTxtFld1;
    private javax.swing.JTextField PlayerTxtFld2;
    private javax.swing.JTextField PlayerTxtFld3;
    private javax.swing.JTextField PlayerTxtFld4;
    private javax.swing.JTextField PlayerTxtFld5;
    private javax.swing.JLabel RandomNameLbl1;
    private javax.swing.JButton StartBttn;
    private javax.swing.JPanel SummaryPagePnl;
    private javax.swing.JButton TruthBttn;
    private javax.swing.JPanel TruthOrDarePnl;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
