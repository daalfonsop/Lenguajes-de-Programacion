/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.LogicaUsuario;
import Modelo.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;
import rojeru_san.complementos.RSUtilities;

/**
 *
 * @author diego
 */
public class Login1 extends javax.swing.JFrame {

    LogicaUsuario logica = new LogicaUsuario();
    public Login1() {
        initComponents();
        RSUtilities.setCenterWindow(this);
        RSUtilities.setOpaqueWindow(this, false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rojeru_san.rspanel.RSPanelGradiente();
        rSPanelShadow1 = new rojeru_san.rspanel.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        contraseña = new RSMaterialComponent.RSPasswordIconDos();
        usuario = new RSMaterialComponent.RSTextFieldIconDos();
        boton = new rojerusan.RSMaterialButtonRectangle();
        advertencia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 112, 192));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inicio de Sesión");

        contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraseña.setPlaceholder("Contraseña");

        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setPlaceholder("Usuario");

        boton.setText("Entrar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        advertencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        advertencia.setForeground(new java.awt.Color(255, 255, 255));
        advertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        advertencia.setText("¡Datos incorrectos, intentelo nuevamente!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(advertencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(advertencia)
                .addGap(4, 4, 4)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        getContentPane().add(rSPanelGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        String user = usuario.getText();
        String pass = contraseña.getText();
        inicioSesion(user,pass);
        
    }//GEN-LAST:event_botonActionPerformed

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertencia;
    private rojerusan.RSMaterialButtonRectangle boton;
    private RSMaterialComponent.RSPasswordIconDos contraseña;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.rspanel.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.rspanel.RSPanelShadow rSPanelShadow1;
    private RSMaterialComponent.RSTextFieldIconDos usuario;
    // End of variables declaration//GEN-END:variables

    private void inicioSesion(String user, String pass) {
        
        if(user.isEmpty() || pass.isEmpty()){
            advertencia.setText("          ¡No puede dejar campos vacios!          ");
            advertencia.setForeground(Color.red);
        }else{
            Usuario datos = logica.iniciaSesion(user, pass);
            if(datos != null){
                gestionCliente(datos.getTipoUsuario());
            }else{
                advertencia.setText("¡Datos incorrectos, intentelo nuevamente!");
                advertencia.setForeground(Color.red);
            }
            
        }
    }
    
    public void gestionCliente(String tipo){
        this.dispose();
        switch (tipo) {
            case "admin":
                new VistaAdmin.Home().setVisible(true);
                break;
            case "Odontologo":
            case "Auxiliar":
                new VistaOdon.Home().setVisible(true);
                break;
            case "Cliente":
                new VistaPaciente.Home().setVisible(true);
                break;
            default:
                break;
        }
    }    
}


