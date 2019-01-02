/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.burcu.yatirim.GUI;

import com.burcu.yatirim.dal.MusteriDAO;
import com.burcu.yatirim.models.Musteri;

/**
 *
 * @author burcu
 */
public class frmAnketYatirim extends javax.swing.JFrame {

    /**
     * Creates new form frmAnketYatirim
     */
    
    MusteriDAO db = new MusteriDAO();
    
    public frmAnketYatirim() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabelPuanHesap2 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        lbl33 = new javax.swing.JLabel();
        lbl53 = new javax.swing.JLabel();
        lblPuan4 = new javax.swing.JLabel();
        lbl71 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        lblPuan5 = new javax.swing.JLabel();
        btnAnketYatirim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yatırım Değerlendirme");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Yatırımlarınızı ne kadar süreyle sermaye piyasalarında değerlendirmeyi düşünürsünüz?"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPuanHesap2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(jLabelPuanHesap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 48, 62));

        lbl20.setText("Kısa Vadeli (0 - 6 ay)");
        jPanel4.add(lbl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 210, -1));

        buttonGroup1.add(jRadioButton13);
        jRadioButton13.setText("6");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        buttonGroup1.add(jRadioButton14);
        jRadioButton14.setText("5");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        buttonGroup1.add(jRadioButton15);
        jRadioButton15.setText("7");
        jRadioButton15.setToolTipText("");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        lbl33.setText("Orta Vadeli (6 - 12 ay)");
        jPanel4.add(lbl33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 200, 20));

        lbl53.setText("Uzun Vadeli (1 - 3 yıl)");
        jPanel4.add(lbl53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 200, -1));

        lblPuan4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPuan4.setText("Puan Karşılığı");
        jPanel4.add(lblPuan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 100, -1));

        lbl71.setText("Daha Uzun Vadeli (3 yıldan uzun)");
        jPanel4.add(lbl71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 220, -1));

        buttonGroup1.add(jRadioButton17);
        jRadioButton17.setText("8");
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        lblPuan5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPuan5.setText("Puan");
        jPanel4.add(lblPuan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 70, -1));

        btnAnketYatirim.setText("İleri");
        btnAnketYatirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnketYatirimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(703, Short.MAX_VALUE)
                .addComponent(btnAnketYatirim)
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(btnAnketYatirim)
                .addGap(26, 26, 26))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(110, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
        jLabelPuanHesap2.setText(jRadioButton13.getText());
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
        jLabelPuanHesap2.setText(jRadioButton14.getText());
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
        jLabelPuanHesap2.setText(jRadioButton15.getText());
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        // TODO add your handling code here:
        jLabelPuanHesap2.setText(jRadioButton17.getText());
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void btnAnketYatirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnketYatirimActionPerformed
        // TODO add your handling code here:
        Long yatirim = Long.parseLong(jLabelPuanHesap2.getText());
        
        Musteri mst = new Musteri();        
        mst.setPuanyatirim(yatirim);        
        db.UpdatePuanYatirim(mst);
        
        new frmAnketRiskGetiri().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnketYatirimActionPerformed

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
            java.util.logging.Logger.getLogger(frmAnketYatirim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAnketYatirim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAnketYatirim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAnketYatirim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAnketYatirim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnketYatirim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabelPuanHesap2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl33;
    private javax.swing.JLabel lbl53;
    private javax.swing.JLabel lbl71;
    private javax.swing.JLabel lblPuan4;
    private javax.swing.JLabel lblPuan5;
    // End of variables declaration//GEN-END:variables
}
