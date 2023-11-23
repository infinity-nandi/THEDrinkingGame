/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.thedrinkinggame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
public class THEDrinkingGameMainPage extends javax.swing.JFrame {
    private int playerCounter = 0;
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
    }
    
    public class NoMorePlayerPlace{
        JFrame Warning;
        NoMorePlayerPlace()
        {
            Warning = new JFrame();
            JOptionPane.showMessageDialog(Warning,"Nem lehet több játékost hozzáadni!","Figyelmeztetés",JOptionPane.WARNING_MESSAGE);
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
        TruthOrDarePnl = new javax.swing.JPanel();

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
                        .addGap(305, 305, 305)
                        .addComponent(AddBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(AddBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StartBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );

        NavigatorTbbdPn.addTab("tab1", MainPnl);

        TruthOrDarePnl.setBackground(new java.awt.Color(102, 37, 73));

        javax.swing.GroupLayout TruthOrDarePnlLayout = new javax.swing.GroupLayout(TruthOrDarePnl);
        TruthOrDarePnl.setLayout(TruthOrDarePnlLayout);
        TruthOrDarePnlLayout.setHorizontalGroup(
            TruthOrDarePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        TruthOrDarePnlLayout.setVerticalGroup(
            TruthOrDarePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        NavigatorTbbdPn.addTab("tab2", TruthOrDarePnl);

        getContentPane().add(NavigatorTbbdPn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -35, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayerTxtFld3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerTxtFld3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayerTxtFld3ActionPerformed

    private void AddBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBttnActionPerformed
        //Játékos név mező hozzáadása
         playerCounter++;

    // Show the respective PlayerTxtFld based on the playerCounter value
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
            // If more than 3 players are attempted to be added, show a warning
            new NoMorePlayerPlace();
            break;
    }
    }//GEN-LAST:event_AddBttnActionPerformed

    private void StartBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBttnActionPerformed
        if(!PlayerTxtFld1.getText().isEmpty() && !PlayerTxtFld2.getText().isEmpty())
            NavigatorTbbdPn.setSelectedIndex(1);
        else
            new NotEnoughPlayer();
    }//GEN-LAST:event_StartBttnActionPerformed

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
    private javax.swing.JPanel MainPnl;
    private javax.swing.JTabbedPane NavigatorTbbdPn;
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
    private javax.swing.JButton StartBttn;
    private javax.swing.JPanel TruthOrDarePnl;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
