/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salsabila Putri Ray
 */
public class dendaku extends javax.swing.JFrame {
   

    /**
     * Creates new form dendaku
     */
    public dendaku() {
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

        nama = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        lama = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        denda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 76, 216, 45));

        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 139, 62, 53));
        getContentPane().add(lama, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 210, 62, 52));

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 349, -1, -1));

        jLabel1.setText("Nama");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 88, -1, -1));

        jLabel2.setText("Jumlah Buku");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 155, -1, -1));

        jLabel3.setText("Lama Pinjam");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 226, -1, -1));

        jLabel4.setText("APLIKASI HITUNG DATA DENDA PEMINJAMAN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 26, -1, -1));

        denda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dendaActionPerformed(evt);
            }
        });
        getContentPane().add(denda, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 280, 118, 46));

        jLabel5.setText("Denda");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 293, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int nilai1;
         int nilai2;
         int nilai3;
         String Hasil;

        nilai1=Integer.valueOf(jumlah.getText());
        nilai2=Integer.valueOf(lama.getText());
        
        nilai3= nilai1 * nilai2 * 2500;

        Hasil=String.valueOf(nilai3);
        denda.setText(Hasil);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void dendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dendaActionPerformed

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
            java.util.logging.Logger.getLogger(dendaku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dendaku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dendaku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dendaku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dendaku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField denda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField lama;
    private javax.swing.JTextField nama;
    // End of variables declaration//GEN-END:variables
}
