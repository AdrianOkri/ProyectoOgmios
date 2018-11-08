package main;

import AppPackage.AnimationClass;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Logins.Index;
import Unity.Unity;

/**
 *
 * @author Wasp
 */
public class Main extends javax.swing.JFrame {

    String options;
    boolean positionMenu = true;

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
        lblMenuB = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_20181031_182638_987.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jcbConsola.setBackground(new java.awt.Color(0, 0, 0));
        jcbConsola.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcbConsola.setForeground(new java.awt.Color(255, 255, 255));
        jcbConsola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SpaceShooter", "Fibonacci", "Champernowne", "Variados", "TresEnRaya", "Figuras", "MediaMedianaModa", "VarianzaDesviación" }));
        jcbConsola.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jcbConsola.setFocusable(false);
        jcbConsola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbConsolaActionPerformed(evt);
            }
        });
        jPanel1.add(jcbConsola, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 287, -1));

        jcbGr.setBackground(new java.awt.Color(0, 0, 0));
        jcbGr.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcbGr.setForeground(new java.awt.Color(255, 255, 255));
        jcbGr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Login", "Unity" }));
        jcbGr.setFocusable(false);
        jPanel1.add(jcbGr, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 317, -1));

        lblTitle1.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle1.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("Gráfico");
        jPanel1.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        lblTitle2.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle2.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle2.setText("Consola");
        jPanel1.add(lblTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        btnEjecutarConsola.setBackground(new java.awt.Color(0, 0, 0));
        btnEjecutarConsola.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        btnEjecutarConsola.setForeground(new java.awt.Color(255, 255, 255));
        btnEjecutarConsola.setText("Ejecutar");
        btnEjecutarConsola.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, new java.awt.Color(255, 255, 255)));
        btnEjecutarConsola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarConsolaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEjecutarConsola, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 438, 287, 40));

        btnEjecutarGrafico.setBackground(new java.awt.Color(0, 0, 0));
        btnEjecutarGrafico.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        btnEjecutarGrafico.setForeground(new java.awt.Color(255, 255, 255));
        btnEjecutarGrafico.setText("Ejecutar");
        btnEjecutarGrafico.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, new java.awt.Color(255, 255, 255)));
        btnEjecutarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarGraficoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEjecutarGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 438, 317, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_20181031_223617_999.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        lblMenuB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Menu_32px_1.png"))); // NOI18N
        lblMenuB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuBMouseClicked(evt);
            }
        });
        jPanel1.add(lblMenuB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 320, 30, 30));

        lblMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        lblMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinMouseClicked(evt);
            }
        });
        jPanel1.add(lblMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 420, 30, 30));

        lblInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pregunta.png"))); // NOI18N
        lblInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInfoMouseClicked(evt);
            }
        });
        jPanel1.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Ejecutar el .exe
    private void FileRun(String name) {
        String r = (new File("").getAbsolutePath()) + "\\ProgramasConsola\\" + name + ".exe";
        try {
            String link = "C:\\windows\\System32\\cmd.exe /k start " + r;
            Runtime.getRuntime().exec(link);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void LoginRun() {
        Index window = new Index();
        window.setVisible(true);
    }
    private void UnityRun() {
        Unity unity = new Unity();
        unity.setVisible(true);
    }
    private void jcbConsolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbConsolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbConsolaActionPerformed

    private void btnEjecutarConsolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarConsolaActionPerformed
        options = jcbConsola.getSelectedItem().toString();
        FileRun(options);
    }//GEN-LAST:event_btnEjecutarConsolaActionPerformed
    
    private void btnEjecutarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarGraficoActionPerformed
        // TODO add your handling code here:
        options = jcbGr.getSelectedItem().toString();
        
        switch(options) {
            case "Login": LoginRun(); break;
            case "Unity": UnityRun(); break;
        }
    }//GEN-LAST:event_btnEjecutarGraficoActionPerformed
    
    private void lblMenuBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuBMouseClicked
        // Animación del Menu Burger
         AnimationClass iconContent = new AnimationClass();
         
          if(positionMenu){
            iconContent.jLabelXRight(-40, 10, 10, 5, lblMin);// (Posición actual, posición final, dirección, velocidad, nombre de la etiqueta)
            iconContent.jLabelXRight(-40, 10, 10, 5, lblCerrar);
            iconContent.jLabelXRight(-40, 10, 10, 5, lblInfo);
            positionMenu = false;
        } else {
            iconContent.jLabelXLeft(10, -40, 10, 5, lblMin);
            iconContent.jLabelXLeft(10, -40, 10, 5, lblCerrar);
            iconContent.jLabelXLeft(10, -40, 10, 5, lblInfo);
            positionMenu = true;
        }
    }//GEN-LAST:event_lblMenuBMouseClicked

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        this.setState(Main.ICONIFIED); // Minimizar
    }//GEN-LAST:event_lblMinMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
         System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblInfoMouseClicked

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
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblMenuB;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    // End of variables declaration//GEN-END:variables
}
