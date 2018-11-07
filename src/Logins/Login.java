package Logins;
/**
 *
 * @author Wasp
 */
import AppPackage.AnimationClass;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    boolean positionMenu = true;
    public Login() {
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

        jpIngreso = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        pwUser = new javax.swing.JPasswordField();
        lblMenuB = new javax.swing.JLabel();
        btnEnterIngresar = new javax.swing.JButton();
        lblMusica = new javax.swing.JLabel();
        lblInternet = new javax.swing.JLabel();
        lblCalculadora = new javax.swing.JLabel();
        jpMenu = new javax.swing.JPanel();
        lblEventos = new javax.swing.JLabel();
        lblAjustes = new javax.swing.JLabel();
        lblSocios = new javax.swing.JLabel();
        lblAnotaciones = new javax.swing.JLabel();
        lblCronograma = new javax.swing.JLabel();
        lblDriver = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("LoginAnimation"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jpIngreso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 112, 82), 1, true));
        jpIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("Password:");
        jpIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, 20));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("User:");
        jpIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 50, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_96px_2.png"))); // NOI18N
        jpIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_customer_32px_1.png"))); // NOI18N
        jpIngreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(238, 112, 82));
        txtUser.setBorder(null);
        jpIngreso.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 210, 40));
        jpIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 240, 10));
        jpIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Key_32px.png"))); // NOI18N
        jpIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        pwUser.setBackground(new java.awt.Color(255, 255, 255));
        pwUser.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        pwUser.setForeground(new java.awt.Color(238, 112, 92));
        pwUser.setBorder(null);
        jpIngreso.add(pwUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 200, 40));

        lblMenuB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Menu_32px.png"))); // NOI18N
        lblMenuB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuBMouseClicked(evt);
            }
        });
        jpIngreso.add(lblMenuB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnEnterIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_OFF.png"))); // NOI18N
        btnEnterIngresar.setBorder(null);
        btnEnterIngresar.setBorderPainted(false);
        btnEnterIngresar.setContentAreaFilled(false);
        btnEnterIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnterIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_ON.png"))); // NOI18N
        jpIngreso.add(btnEnterIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        lblMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Musical_Notes_32px.png"))); // NOI18N
        jpIngreso.add(lblMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 140, 30, 30));

        lblInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Globe_32px.png"))); // NOI18N
        jpIngreso.add(lblInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 60, 30, -1));

        lblCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Calculator_32px.png"))); // NOI18N
        jpIngreso.add(lblCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 100, -1, 30));

        getContentPane().add(jpIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jpMenu.setBackground(new java.awt.Color(255, 255, 255));
        jpMenu.setForeground(new java.awt.Color(255, 255, 255));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEventos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Today_96px.png"))); // NOI18N
        lblEventos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblEventosMouseMoved(evt);
            }
        });
        lblEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEventosMouseExited(evt);
            }
        });
        jpMenu.add(lblEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 312, 170, 145));

        lblAjustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Maintenance_96px.png"))); // NOI18N
        lblAjustes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblAjustesMouseMoved(evt);
            }
        });
        lblAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAjustesMouseExited(evt);
            }
        });
        jpMenu.add(lblAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 312, 170, 145));

        lblSocios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSocios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Handshake_96px.png"))); // NOI18N
        lblSocios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblSociosMouseMoved(evt);
            }
        });
        lblSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSociosMouseExited(evt);
            }
        });
        jpMenu.add(lblSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 312, 170, 145));

        lblAnotaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnotaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Idea_96px.png"))); // NOI18N
        lblAnotaciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblAnotacionesMouseMoved(evt);
            }
        });
        lblAnotaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAnotacionesMouseExited(evt);
            }
        });
        jpMenu.add(lblAnotaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 69, 170, 145));

        lblCronograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Clock_96px.png"))); // NOI18N
        lblCronograma.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCronogramaMouseMoved(evt);
            }
        });
        lblCronograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCronogramaMouseExited(evt);
            }
        });
        jpMenu.add(lblCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 69, 170, 145));

        lblDriver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDriver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Google_Drive_96px.png"))); // NOI18N
        lblDriver.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblDriverMouseMoved(evt);
            }
        });
        lblDriver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDriverMouseExited(evt);
            }
        });
        jpMenu.add(lblDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 69, 170, 145));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 112, 92));
        jLabel7.setText("Driver");
        jpMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(238, 112, 92));
        jLabel14.setText("Cronograma");
        jpMenu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 110, 20));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(238, 112, 92));
        jLabel15.setText("Ajustes");
        jpMenu.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 70, 130));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(238, 112, 92));
        jLabel16.setText("Anotaciones");
        jpMenu.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 110, 130));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(238, 112, 92));
        jLabel17.setText("Eventos");
        jpMenu.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 70, 130));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(238, 112, 92));
        jLabel18.setText("Socios");
        jpMenu.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 60, 130));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscar.setBorder(null);
        jpMenu.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 220, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Search_32px_2.png"))); // NOI18N
        jpMenu.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));
        jpMenu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 260, 10));

        getContentPane().add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, 30));

        lblMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        lblMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinMouseClicked(evt);
            }
        });
        jPanel2.add(lblMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuBMouseClicked
        AnimationClass iconContent = new AnimationClass();
        if(positionMenu){
            iconContent.jLabelXRight(-40, 10, 10, 5, lblInternet);// (Posición actual, posición final, dirección, velocidad, nombre de la etiqueta)
            iconContent.jLabelXRight(-40, 10, 10, 5, lblCalculadora);
            iconContent.jLabelXRight(-40, 10, 10, 5, lblMusica);
            positionMenu = false;
        } else {
            iconContent.jLabelXLeft(10, -40, 10, 5, lblInternet);
            iconContent.jLabelXLeft(10, -40, 10, 5, lblCalculadora);
            iconContent.jLabelXLeft(10, -40, 10, 5, lblMusica);
            positionMenu = true;
        }
    }//GEN-LAST:event_lblMenuBMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        this.dispose();   
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        // TODO add your handling code here:
        this.setState(Login.ICONIFIED); // Minimizar
    }//GEN-LAST:event_lblMinMouseClicked

    private void lblDriverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDriverMouseMoved
        // Evento para cuando el mouse pase por el lbl se pinte el borde
        lblDriver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_lblDriverMouseMoved

    private void lblDriverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDriverMouseExited
        // Cuando el Mouse salga del lbl se quite el border
        lblDriver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_lblDriverMouseExited

    private void lblEventosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventosMouseMoved
        lblEventos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_lblEventosMouseMoved

    private void lblEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventosMouseExited
        lblEventos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_lblEventosMouseExited

    private void lblCronogramaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCronogramaMouseMoved
         lblCronograma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_lblCronogramaMouseMoved

    private void lblCronogramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCronogramaMouseExited
         lblCronograma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_lblCronogramaMouseExited

    private void lblSociosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSociosMouseMoved
         lblSocios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_lblSociosMouseMoved

    private void lblSociosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSociosMouseExited
         lblSocios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_lblSociosMouseExited

    private void lblAnotacionesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnotacionesMouseMoved
         lblAnotaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_lblAnotacionesMouseMoved

    private void lblAnotacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnotacionesMouseExited
         lblAnotaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_lblAnotacionesMouseExited

    private void lblAjustesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAjustesMouseMoved
         lblAjustes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_lblAjustesMouseMoved

    private void lblAjustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAjustesMouseExited
         lblAjustes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_lblAjustesMouseExited

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
                if ("Widows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jpIngreso;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel lblAjustes;
    private javax.swing.JLabel lblAnotaciones;
    private javax.swing.JLabel lblCalculadora;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCronograma;
    private javax.swing.JLabel lblDriver;
    private javax.swing.JLabel lblEventos;
    private javax.swing.JLabel lblInternet;
    private javax.swing.JLabel lblMenuB;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblMusica;
    private javax.swing.JLabel lblSocios;
    private javax.swing.JPasswordField pwUser;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}