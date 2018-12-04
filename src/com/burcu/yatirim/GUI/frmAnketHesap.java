/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.burcu.yatirim.GUI;

import com.burcu.yatirim.dal.MusteriDAO;
import com.burcu.yatirim.models.Doviz;
import com.burcu.yatirim.models.Faiz;
import com.burcu.yatirim.models.Hesap;
import com.burcu.yatirim.models.Musteri;
import com.burcu.yatirim.models.Tahvil;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author burcu
 */
public class frmAnketHesap extends javax.swing.JFrame {

    /**
     * Creates new form frmAnket
     */
    public frmAnketHesap() {
        initComponents();
    }

    MusteriDAO db = new MusteriDAO();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtonSon = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabelPuanHesap3 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        lbl34 = new javax.swing.JLabel();
        lbl54 = new javax.swing.JLabel();
        lbl72 = new javax.swing.JLabel();
        lblPuan6 = new javax.swing.JLabel();
        lblPuan7 = new javax.swing.JLabel();
        txtAnaPara = new javax.swing.JLabel();
        txtFieldAnaPara = new javax.swing.JTextField();
        txtFaiz = new javax.swing.JLabel();
        txtFieldFaiz = new javax.swing.JTextField();
        txtDoviz = new javax.swing.JLabel();
        txtFieldDoviz = new javax.swing.JTextField();
        txtTahvil = new javax.swing.JLabel();
        txtFieldTahvil = new javax.swing.JTextField();
        jButtonHesapla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yatırım Değerlendirme");
        setPreferredSize(new java.awt.Dimension(798, 378));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSon.setText("Son");
        jButtonSon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSonActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSon, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 1325, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Yatırımlarınızı ne kadar süreyle sermaye piyasalarında değerlendirmeyi düşünürsünüz?"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jLabelPuanHesap3, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 114, 48, 62));

        lbl21.setText("Kısa Vadeli (0-6 ay)");
        jPanel5.add(lbl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 57, -1, -1));

        buttonGroup1.add(jRadioButton18);
        jRadioButton18.setText("4");
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        buttonGroup1.add(jRadioButton19);
        jRadioButton19.setText("3");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        buttonGroup1.add(jRadioButton20);
        jRadioButton20.setText("6");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        buttonGroup1.add(jRadioButton21);
        jRadioButton21.setText("6");
        jRadioButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton21ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        lbl34.setText("Orta Vadeli (6 – 12 ay)");
        jPanel5.add(lbl34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 84, -1, -1));

        lbl54.setText("Uzun Vadeli (1 − 3 yıl)");
        jPanel5.add(lbl54, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 118, 643, -1));

        lbl72.setText("Daha Uzun Vadeli (3 yıldan uzun)");
        jPanel5.add(lbl72, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        lblPuan6.setText("Puan Karşılığı");
        jPanel5.add(lblPuan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 31, 136, -1));

        lblPuan7.setText("Puan");
        jPanel5.add(lblPuan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 31, 70, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        txtAnaPara.setText("<html>Yatırım olarak değerlendirmek istediğiniz Anapara tutarı:</html>");
        getContentPane().add(txtAnaPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 40));

        txtFieldAnaPara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAnaParaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldAnaPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 170, -1));

        txtFaiz.setText("<html>Anaparanın Faiz'e yatırılmak istenen tutarı:</html>");
        getContentPane().add(txtFaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, -1));

        txtFieldFaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFaizActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldFaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 170, -1));

        txtDoviz.setText("<html>Anaparanın Döviz'e yatırılmak istenen tutarı:</html>");
        getContentPane().add(txtDoviz, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 30));

        txtFieldDoviz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldDovizActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldDoviz, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 170, -1));

        txtTahvil.setText("<html>Anaparanın Tahvil'e yatırılmak istenen tutarı:</html>");
        getContentPane().add(txtTahvil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 140, -1));

        txtFieldTahvil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldTahvilActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldTahvil, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 170, -1));

        jButtonHesapla.setText("Hesapla");
        jButtonHesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHesaplaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHesapla, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSonActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton21ActionPerformed

    private void txtFieldAnaParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAnaParaActionPerformed
        // TODO add your handling code here:       
        AnaParaHesap();
    }//GEN-LAST:event_txtFieldAnaParaActionPerformed

    private void txtFieldFaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFaizActionPerformed
        // TODO add your handling code here:
        FaizHesap();
    }//GEN-LAST:event_txtFieldFaizActionPerformed

    private void txtFieldDovizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldDovizActionPerformed
        // TODO add your handling code here:
        DovizHesap();
    }//GEN-LAST:event_txtFieldDovizActionPerformed

    private void txtFieldTahvilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldTahvilActionPerformed
        // TODO add your handling code here:
        TahvilHesap();
    }//GEN-LAST:event_txtFieldTahvilActionPerformed

    private void jButtonHesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHesaplaActionPerformed
        // TODO add your handling code here:
        Hesapla();               
    }//GEN-LAST:event_jButtonHesaplaActionPerformed

    public double FaizHesap() {
        double faizDeger = Integer.parseInt(txtFieldFaiz.getText());
        return faizDeger;
    }

    public double DovizHesap() {
        double dovizDeger = Integer.parseInt(txtFieldDoviz.getText());
        return dovizDeger;
    }

    public double TahvilHesap() {
        double tahvilDeger = Integer.parseInt(txtFieldTahvil.getText());
        return tahvilDeger;
    }

    public double AnaParaHesap() {
        double anaparaDeger = Integer.parseInt(txtFieldAnaPara.getText());
        return anaparaDeger;
    }
    
    public void Hesapla(){
        if (AnaParaHesap() == FaizHesap() + DovizHesap() + TahvilHesap()) {

            Date ilk = new GregorianCalendar(2007, 10, 12).getTime();
            Date son = new GregorianCalendar(2007, 10, 30).getTime();

            Hesap Hesap = new Hesap("hesap", AnaParaHesap(), ilk, son);
            Faiz kar = new Faiz("faiz hesabı", FaizHesap(), ilk, son, 10);
            Tahvil Tahvil = new Tahvil("tahvil hesabı", TahvilHesap(), ilk, son, 2);
            Doviz dvz = new Doviz("döviz hesabı", DovizHesap(), ilk, son, 5, 1.5);
            Musteri Musteri = new Musteri("musteri", Hesap, kar, dvz, Tahvil);

            
            JOptionPane.showMessageDialog(null, "Müşterinin Danışmana Verdiği Para= " + Hesap.getAnaPara()
                    + " \n" + "Faize Yatırılan Para= " + kar.getAnaPara()
                    + " \n" + "Faizden Kazanılan Para= " + kar.getiri()
                    + " \n" + "Dövize Yatırılan Para= " + dvz.getAnaPara()
                    + " \n" + "Dövizden Kazanılan Para= " + dvz.getiri()
                    + " \n" + "Tahvile Yatırılan Para= " + Tahvil.getAnaPara()
                    + " \n" + "Tahvilden Kazanılan Para= " + Tahvil.getiri(), "Hesaplama", HEIGHT);

        } else {
            JOptionPane.showConfirmDialog(null, "Yatırım olarak ayrımlarınızın toplamı Anapara miktarını tutmalıdır.",
                    "HATA", JOptionPane.ERROR_MESSAGE);
        }
        
    }

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
            java.util.logging.Logger.getLogger(frmAnketHesap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAnketHesap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAnketHesap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAnketHesap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAnketHesap().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonHesapla;
    private javax.swing.JButton jButtonSon;
    private javax.swing.JLabel jLabelPuanHesap3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl34;
    private javax.swing.JLabel lbl54;
    private javax.swing.JLabel lbl72;
    private javax.swing.JLabel lblPuan6;
    private javax.swing.JLabel lblPuan7;
    private javax.swing.JLabel txtAnaPara;
    private javax.swing.JLabel txtDoviz;
    private javax.swing.JLabel txtFaiz;
    private javax.swing.JTextField txtFieldAnaPara;
    private javax.swing.JTextField txtFieldDoviz;
    private javax.swing.JTextField txtFieldFaiz;
    private javax.swing.JTextField txtFieldTahvil;
    private javax.swing.JLabel txtTahvil;
    // End of variables declaration//GEN-END:variables
}
