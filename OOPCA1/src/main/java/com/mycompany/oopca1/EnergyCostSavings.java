/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.oopca1;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Stephen Sludds
 * x22442806
 */
public class EnergyCostSavings extends javax.swing.JFrame {

    /**
     * Creates new form EnergyCostSavings
     */
    public EnergyCostSavings() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBLEnergyUsePm = new javax.swing.JLabel();
        TFEnergyCostPy = new javax.swing.JTextField();
        TFEnergyUse = new javax.swing.JTextField();
        LBLEnergyUsePm1 = new javax.swing.JLabel();
        LBLEnergyUsePm2 = new javax.swing.JLabel();
        TFSolarSize = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LBLEnergyUsePm3 = new javax.swing.JLabel();
        TFSolarEfficiency = new javax.swing.JTextField();
        LBLEnergyUsePm4 = new javax.swing.JLabel();
        TFSolarCost = new javax.swing.JTextField();
        TFAnnualSolarProduction = new javax.swing.JLabel();
        TFEnergyCostSavings = new javax.swing.JLabel();
        TFPaybackPeriod = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        LBLDisclaimer = new javax.swing.JLabel();
        LBLEnergyUsePm5 = new javax.swing.JLabel();
        TFSunlight = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBLEnergyUsePm.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        LBLEnergyUsePm.setText("Energy Use Per Year (kwh) ");

        TFEnergyCostPy.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        TFEnergyCostPy.setText("1909");

        TFEnergyUse.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        TFEnergyUse.setText("5000");

        LBLEnergyUsePm1.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        LBLEnergyUsePm1.setText("Average Energy Cost per Year");

        LBLEnergyUsePm2.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        LBLEnergyUsePm2.setText("Solar Panel Size (Sq. M)");

        TFSolarSize.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        TFSolarSize.setText("20");
        TFSolarSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSolarSizeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Vivaldi", 0, 36)); // NOI18N
        jLabel1.setText("Energy Cost Savings Calculator");
        jLabel1.setToolTipText("");

        LBLEnergyUsePm3.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        LBLEnergyUsePm3.setText("Solar Panel Efficiency (%)");

        TFSolarEfficiency.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        TFSolarEfficiency.setText("18");
        TFSolarEfficiency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSolarEfficiencyActionPerformed(evt);
            }
        });

        LBLEnergyUsePm4.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        LBLEnergyUsePm4.setText("Solar Panel Cost");

        TFSolarCost.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        TFSolarCost.setText("5000");

        TFAnnualSolarProduction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TFEnergyCostSavings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TFPaybackPeriod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        resetButton.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        LBLDisclaimer.setText("* Feilds already inputted are based on an average in Ireland as of 2023.");

        LBLEnergyUsePm5.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        LBLEnergyUsePm5.setText("Hours of Sunlight");
        LBLEnergyUsePm5.setToolTipText("");

        TFSunlight.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        TFSunlight.setText("4");
        TFSunlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSunlightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLEnergyUsePm)
                            .addComponent(LBLEnergyUsePm1)
                            .addComponent(TFEnergyCostPy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFEnergyUse, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLEnergyUsePm2)
                            .addComponent(TFSolarSize, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBLEnergyUsePm3)
                            .addComponent(TFSolarEfficiency, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLEnergyUsePm5)
                            .addComponent(TFSunlight, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBLEnergyUsePm4)
                            .addComponent(TFSolarCost, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addComponent(TFAnnualSolarProduction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TFEnergyCostSavings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TFPaybackPeriod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBLDisclaimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClose, resetButton, submitButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TFEnergyCostPy, TFEnergyUse, TFSolarCost, TFSolarEfficiency, TFSolarSize});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(LBLDisclaimer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBLEnergyUsePm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(TFEnergyUse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBLEnergyUsePm2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(TFSolarSize, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(TFSolarCost, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LBLEnergyUsePm4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBLEnergyUsePm1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFEnergyCostPy, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFSolarEfficiency, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFSunlight, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LBLEnergyUsePm3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLEnergyUsePm5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(TFAnnualSolarProduction, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFEnergyCostSavings, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFPaybackPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(resetButton)
                    .addComponent(btnClose))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
    // Set the text fields to their default values
    TFEnergyCostPy.setText("1909");
    TFEnergyUse.setText("5000");
    TFSolarEfficiency.setText("18");
    TFSolarSize.setText("20");
    TFSolarCost.setText("5000");
    // Clear the output fields
    TFEnergyCostSavings.setText("");
    TFPaybackPeriod.setText("");
    TFAnnualSolarProduction.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
         try {
        EnergyConversion energyConversion = new EnergyConversion();
        double consumption = Double.parseDouble(TFEnergyUse.getText());
        double cost = Double.parseDouble(TFEnergyCostPy.getText());
        double efficiency = Double.parseDouble(TFSolarEfficiency.getText());
        double size = Double.parseDouble(TFSolarSize.getText());
        double panelCost = Double.parseDouble(TFSolarCost.getText());
        double averageDailySunlightHours = Double.parseDouble(TFSunlight.getText());

        energyConversion.setCurrentEnergyConsumption(consumption);
        energyConversion.setCurrentEnergyCost(cost);
        energyConversion.setSolarPanelEfficiency(efficiency);
        energyConversion.setSolarPanelSize(size);
        energyConversion.setSolarPanelCost(panelCost);

       double annualProduction = energyConversion.calculateAnnualSolarEnergyProduction(averageDailySunlightHours);
       double savings = energyConversion.calculateAnnualEnergyCostSavings(averageDailySunlightHours, cost);
       double paybackPeriod = energyConversion.calculatePaybackPeriod(averageDailySunlightHours, cost);
        
        TFAnnualSolarProduction.setText("Annual Solar Production:  " + String.format("%.2f kWh", annualProduction));
        TFPaybackPeriod.setText("Payback period:  " + String.format("%.2f years", paybackPeriod));
        TFEnergyCostSavings.setText("Energy Cost Savings (per annum):  " + String.format("€%.2f", savings));
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please enter valid numeric values.");
    }

    }//GEN-LAST:event_submitButtonActionPerformed

    private void TFSolarSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSolarSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFSolarSizeActionPerformed

    private void TFSolarEfficiencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSolarEfficiencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFSolarEfficiencyActionPerformed

    private void TFSunlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSunlightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFSunlightActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnergyCostSavings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnergyCostSavings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnergyCostSavings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnergyCostSavings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnergyCostSavings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLDisclaimer;
    private javax.swing.JLabel LBLEnergyUsePm;
    private javax.swing.JLabel LBLEnergyUsePm1;
    private javax.swing.JLabel LBLEnergyUsePm2;
    private javax.swing.JLabel LBLEnergyUsePm3;
    private javax.swing.JLabel LBLEnergyUsePm4;
    private javax.swing.JLabel LBLEnergyUsePm5;
    private javax.swing.JLabel TFAnnualSolarProduction;
    private javax.swing.JTextField TFEnergyCostPy;
    private javax.swing.JLabel TFEnergyCostSavings;
    private javax.swing.JTextField TFEnergyUse;
    private javax.swing.JLabel TFPaybackPeriod;
    private javax.swing.JTextField TFSolarCost;
    private javax.swing.JTextField TFSolarEfficiency;
    private javax.swing.JTextField TFSolarSize;
    private javax.swing.JTextField TFSunlight;
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
