/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.burcu.yatirim.GUI;

/**
 *
 * @author User
 */
public class frmAnketRiskGetiri extends javax.swing.JFrame {

    /**
     * Creates new form frmAnketRiskGetiri
     */
    public frmAnketRiskGetiri() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabelPuanHesap1 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        lbl32 = new javax.swing.JLabel();
        lbl52 = new javax.swing.JLabel();
        lbl69 = new javax.swing.JLabel();
        lblPuan2 = new javax.swing.JLabel();
        lblPuan3 = new javax.swing.JLabel();
        lbl73 = new javax.swing.JLabel();
        jRadioButton26 = new javax.swing.JRadioButton();
        btnAnketRiskGetiri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(" Risk ve getiri tercihiniz nedir?"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabelPuanHesap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 114, 48, 62));

        lbl19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl19.setText("<html>Olabildiğince riskten kaçınır, güvenli yatırım araçlarını tercih eder, az ama düzenli bir getiri sağlamayı tercih ederim. (Anaparam aynen korunsun)</html>");
        lbl19.setToolTipText("");
        lbl19.setAutoscrolls(true);
        lbl19.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lbl19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 440, 40));

        jRadioButton7.setText("15");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, 30));

        jRadioButton8.setText("10");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, 30));

        jRadioButton9.setText("20");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, 30));

        jRadioButton10.setText("40");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, 30));

        lbl32.setText("<html>Enflasyonun üzerinde getiri beklentisiyle, yatırımımda düşük riskli ürünlere yatırım yapabilirim. (Anaparadan çok az bir miktar kaybetmeyi göze alabilirim)</html>");
        jPanel2.add(lbl32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 430, -1));

        lbl52.setText("<html>Genel olarak orta riskli ürünleri tercih etmekle beraber, uzun vadede toplam getirimi artırmak amacıyla, riskli ürünlere makul ölçüde yatırım yapabilirim. (Anaparadan bir miktar kaybetmeyi göze alabilirim)</html>");
        jPanel2.add(lbl52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 440, -1));

        lbl69.setText("<html>Çok yüksek getiri isterim ve çok yüksek riskli ürünlere yatırım yapabilirim. Gelişmiş yatırım ürünlerinin riskleri konusunda bilgiliyim ve bu ürünlere yatırım yapabilirim. (Anaparayı tamamen kaybetmeyi göze alabilirim)</html>");
        jPanel2.add(lbl69, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 430, 60));

        lblPuan2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPuan2.setText("Puan Karşılığı");
        jPanel2.add(lblPuan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 136, -1));

        lblPuan3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPuan3.setText("Puan");
        jPanel2.add(lblPuan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 70, -1));

        lbl73.setText("<html>Yüksek getiri beklentisiyle, yüksek riskli ürünlere yatırım yapabilirim (Anaparadan kaybetmeyi göze alabilirim)</html>");
        jPanel2.add(lbl73, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 440, 40));

        jRadioButton26.setText("30");
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, 30));

        btnAnketRiskGetiri.setText("İleri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnketRiskGetiri)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnketRiskGetiri)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton26ActionPerformed

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
            java.util.logging.Logger.getLogger(frmAnketRiskGetiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAnketRiskGetiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAnketRiskGetiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAnketRiskGetiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAnketRiskGetiri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnketRiskGetiri;
    private javax.swing.JLabel jLabelPuanHesap1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl52;
    private javax.swing.JLabel lbl69;
    private javax.swing.JLabel lbl73;
    private javax.swing.JLabel lblPuan2;
    private javax.swing.JLabel lblPuan3;
    // End of variables declaration//GEN-END:variables
}
