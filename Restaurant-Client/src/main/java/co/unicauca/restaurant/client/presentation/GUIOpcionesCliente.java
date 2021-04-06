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
public class GUIOpcionesCliente extends javax.swing.JFrame {

    /**
     * Creates new form GUIOpcionesCliente
     */
    public GUIOpcionesCliente() {
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

        PnlOpcionesCliente = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        LblAplicacion = new javax.swing.JLabel();
        LblIngreso = new javax.swing.JLabel();
        LblSeleccione = new javax.swing.JLabel();
        BtnVerRestaurantes = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlOpcionesCliente.setBackground(new java.awt.Color(51, 153, 255));

        LblTitulo.setText("Software Food");

        LblAplicacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        LblAplicacion.setText("Aplicación Software Food");

        LblIngreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblIngreso.setText("Ingreso como cliente");

        LblSeleccione.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblSeleccione.setText("Seleccione la opción que desea realizar");

        BtnVerRestaurantes.setText("Visualizar Restaurantes de la ciudad");
        BtnVerRestaurantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerRestaurantesActionPerformed(evt);
            }
        });

        BtnAtras.setText("Atrás");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlOpcionesClienteLayout = new javax.swing.GroupLayout(PnlOpcionesCliente);
        PnlOpcionesCliente.setLayout(PnlOpcionesClienteLayout);
        PnlOpcionesClienteLayout.setHorizontalGroup(
            PnlOpcionesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlOpcionesClienteLayout.createSequentialGroup()
                .addGroup(PnlOpcionesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlOpcionesClienteLayout.createSequentialGroup()
                        .addComponent(LblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAtras))
                    .addGroup(PnlOpcionesClienteLayout.createSequentialGroup()
                        .addGroup(PnlOpcionesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlOpcionesClienteLayout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(LblIngreso))
                            .addGroup(PnlOpcionesClienteLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(PnlOpcionesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblSeleccione)
                                    .addComponent(LblAplicacion)
                                    .addGroup(PnlOpcionesClienteLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(BtnVerRestaurantes)))))
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlOpcionesClienteLayout.setVerticalGroup(
            PnlOpcionesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlOpcionesClienteLayout.createSequentialGroup()
                .addGroup(PnlOpcionesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTitulo)
                    .addGroup(PnlOpcionesClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnAtras)))
                .addGap(22, 22, 22)
                .addComponent(LblAplicacion)
                .addGap(31, 31, 31)
                .addComponent(LblIngreso)
                .addGap(18, 18, 18)
                .addComponent(LblSeleccione)
                .addGap(57, 57, 57)
                .addComponent(BtnVerRestaurantes)
                .addGap(0, 65, Short.MAX_VALUE))
        );

        getContentPane().add(PnlOpcionesCliente, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        setVisible(false);
        GUILoginCliente ins = new GUILoginCliente();
        ins.setVisible(true); 
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void BtnVerRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerRestaurantesActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    GUIListarRestaurantes ins = new GUIListarRestaurantes();
                    ins.setVisible(true);
                    setVisible(false);
                }
            });
    }//GEN-LAST:event_BtnVerRestaurantesActionPerformed

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
            java.util.logging.Logger.getLogger(GUIOpcionesCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIOpcionesCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIOpcionesCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIOpcionesCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIOpcionesCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnVerRestaurantes;
    private javax.swing.JLabel LblAplicacion;
    private javax.swing.JLabel LblIngreso;
    private javax.swing.JLabel LblSeleccione;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel PnlOpcionesCliente;
    // End of variables declaration//GEN-END:variables
}
