/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.client.presentation;

/**
 *
 * @author juan jose
 */
public class GUIOpcionesAdmin extends javax.swing.JFrame {
    private String usuario = "";
    /**
     * Creates new form GUIOpcionesAdmin
     */
    public GUIOpcionesAdmin() {
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

        PnlOpcionesAdmin = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        LblAplicacion = new javax.swing.JLabel();
        LblIngresaste = new javax.swing.JLabel();
        LblSelecionaOpcion = new javax.swing.JLabel();
        BtnAgregarComponentes = new javax.swing.JButton();
        BtnListarComponentes = new javax.swing.JButton();
        BtnActualizarAlmuezo = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlOpcionesAdmin.setBackground(new java.awt.Color(51, 153, 255));

        LblTitulo.setText("Software Food");

        LblAplicacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        LblAplicacion.setText("Aplicación Software Food");

        LblIngresaste.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblIngresaste.setText("Ingresaste como Administrador");

        LblSelecionaOpcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblSelecionaOpcion.setText("Seleccione lo que desea realizar");

        BtnAgregarComponentes.setText("Agregar componentes almuerzo ejecutivo");
        BtnAgregarComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarComponentesActionPerformed(evt);
            }
        });

        BtnListarComponentes.setText("Listar Componentes almuerzo ejecutivo");
        BtnListarComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarComponentesActionPerformed(evt);
            }
        });

        BtnActualizarAlmuezo.setText("Actualizar almuerzo ejecutivo del día");
        BtnActualizarAlmuezo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarAlmuezoActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlOpcionesAdminLayout = new javax.swing.GroupLayout(PnlOpcionesAdmin);
        PnlOpcionesAdmin.setLayout(PnlOpcionesAdminLayout);
        PnlOpcionesAdminLayout.setHorizontalGroup(
            PnlOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlOpcionesAdminLayout.createSequentialGroup()
                .addGroup(PnlOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlOpcionesAdminLayout.createSequentialGroup()
                        .addComponent(LblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSalir))
                    .addGroup(PnlOpcionesAdminLayout.createSequentialGroup()
                        .addGroup(PnlOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlOpcionesAdminLayout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addGroup(PnlOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblSelecionaOpcion)
                                    .addComponent(LblIngresaste)))
                            .addGroup(PnlOpcionesAdminLayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addGroup(PnlOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnAgregarComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LblAplicacion)
                                    .addComponent(BtnListarComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnActualizarAlmuezo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlOpcionesAdminLayout.setVerticalGroup(
            PnlOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlOpcionesAdminLayout.createSequentialGroup()
                .addGroup(PnlOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTitulo)
                    .addGroup(PnlOpcionesAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnSalir)))
                .addGap(15, 15, 15)
                .addComponent(LblAplicacion)
                .addGap(18, 18, 18)
                .addComponent(LblIngresaste)
                .addGap(18, 18, 18)
                .addComponent(LblSelecionaOpcion)
                .addGap(36, 36, 36)
                .addComponent(BtnAgregarComponentes)
                .addGap(26, 26, 26)
                .addComponent(BtnListarComponentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(BtnActualizarAlmuezo)
                .addContainerGap())
        );

        getContentPane().add(PnlOpcionesAdmin, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarComponentesActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        GUIAgregarComponentes ins = new GUIAgregarComponentes();
        ins.setVisible(true); 
    }//GEN-LAST:event_BtnAgregarComponentesActionPerformed

    private void BtnActualizarAlmuezoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarAlmuezoActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        GUIActualizarAlmuerzo ins = new GUIActualizarAlmuerzo();
        ins.getUsuario(usuario);
        ins.setVisible(true);
    }//GEN-LAST:event_BtnActualizarAlmuezoActionPerformed

    private void BtnListarComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarComponentesActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        GUIListarComponentes ins = new GUIListarComponentes();
        ins.setVisible(true);
    }//GEN-LAST:event_BtnListarComponentesActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        setVisible(false);
        GUILoginAdmin ins = new GUILoginAdmin();
        ins.setVisible(true); 
    }//GEN-LAST:event_BtnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(GUIOpcionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIOpcionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIOpcionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIOpcionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIOpcionesAdmin().setVisible(true);
            }
        });
    }
    
    public void getUsuario(String usuario){
        this.usuario = usuario;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarAlmuezo;
    private javax.swing.JButton BtnAgregarComponentes;
    private javax.swing.JButton BtnListarComponentes;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblAplicacion;
    private javax.swing.JLabel LblIngresaste;
    private javax.swing.JLabel LblSelecionaOpcion;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel PnlOpcionesAdmin;
    // End of variables declaration//GEN-END:variables
}
