package main;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wasp
 */
public class Main extends javax.swing.JFrame {

    String options;

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbConsola = new javax.swing.JComboBox<>();
        jcbGr = new javax.swing.JComboBox<>();
        lblTitle1 = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        btnEjecutarConsola = new javax.swing.JButton();
        btnEjecutarGrafico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_20181031_182638_987.jpg"))); // NOI18N

        jcbConsola.setBackground(new java.awt.Color(0, 0, 0));
        jcbConsola.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcbConsola.setForeground(new java.awt.Color(255, 255, 255));
        jcbConsola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SpaceShooter", "Fibonacci", "Champernowne", "Variados" }));
        jcbConsola.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jcbConsola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbConsolaActionPerformed(evt);
            }
        });

        jcbGr.setBackground(new java.awt.Color(0, 0, 0));
        jcbGr.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcbGr.setForeground(new java.awt.Color(255, 255, 255));
        jcbGr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Login", "Videojuego", " " }));

        lblTitle1.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle1.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("Gráfico");

        lblTitle2.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle2.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle2.setText("Consola");

        btnEjecutarConsola.setBackground(new java.awt.Color(0, 0, 0));
        btnEjecutarConsola.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        btnEjecutarConsola.setForeground(new java.awt.Color(255, 255, 255));
        btnEjecutarConsola.setText("Ejecutar");
        btnEjecutarConsola.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnEjecutarConsola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarConsolaActionPerformed(evt);
            }
        });

        btnEjecutarGrafico.setBackground(new java.awt.Color(0, 0, 0));
        btnEjecutarGrafico.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        btnEjecutarGrafico.setForeground(new java.awt.Color(255, 255, 255));
        btnEjecutarGrafico.setText("Ejecutar");
        btnEjecutarGrafico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_20181031_223617_999.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbConsola, 0, 287, Short.MAX_VALUE)
                            .addComponent(btnEjecutarConsola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbGr, 0, 317, Short.MAX_VALUE)
                            .addComponent(btnEjecutarGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblTitle2)
                        .addGap(217, 217, 217)
                        .addComponent(lblTitle1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle1)
                    .addComponent(lblTitle2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbConsola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbGr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEjecutarConsola)
                    .addComponent(btnEjecutarGrafico))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void FileRun(String name) {
        String r = (new File("").getAbsolutePath()) + "\\ProgramasConsola\\" + name + ".exe";
        try {
            String link = "C:\\windows\\System32\\cmd.exe /k start " + r;
            Runtime.getRuntime().exec(link);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jcbConsolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbConsolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbConsolaActionPerformed

    private void btnEjecutarConsolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarConsolaActionPerformed
        options = jcbConsola.getSelectedItem().toString();
        FileRun(options);
    }//GEN-LAST:event_btnEjecutarConsolaActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutarConsola;
    private javax.swing.JButton btnEjecutarGrafico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbConsola;
    private javax.swing.JComboBox<String> jcbGr;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    // End of variables declaration//GEN-END:variables
}
