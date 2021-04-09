/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.client.presentation;

import co.unicauca.restaurant.client.access.Factory;
import co.unicauca.restaurant.client.access.IClientAccess;
import co.unicauca.restaurant.client.domain.ClientService;
import co.unicauca.restaurant.commons.domain.Component;
import co.unicauca.restaurant.commons.domain.PlatoEjecutivo;
import co.unicauca.restaurant.commons.domain.Restaurant;
import java.awt.Image;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author braia
 */
public class GUISeleccionarRestaurante extends javax.swing.JFrame {
    
    private Object bean;
    private IClientAccess service;
    private ClientService servicioRestaurante;
    private PlatoEjecutivo plato;
    private List<Restaurant> listRestaurants = null;
    private Restaurant restaurante;
    private Component componentP;
    
    DefaultListModel modelBuscarRestaurantes;
    /**
     * Creates new customizer GUISeleccionarRestaurante
     */
    public GUISeleccionarRestaurante() {
        initComponents();
        showImage();
        this.setLocationRelativeTo(null);
        this.modelBuscarRestaurantes = new DefaultListModel();
        buscarRestaurante.setModel(modelBuscarRestaurantes);
        this.service = Factory.getInstance().getClienteService();
        servicioRestaurante = new ClientService(service);
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlSeleccionarRestaurante = new javax.swing.JPanel();
        LblAplicacion = new javax.swing.JLabel();
        BtnAtras = new javax.swing.JButton();
        LblSelecione = new javax.swing.JLabel();
        BtnSelecRest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtxtIDRestaurante = new javax.swing.JTextField();
        buscarRestaurante = new javax.swing.JList<>();
        lblImgPrincipal = new javax.swing.JLabel();
        lblMensAplicacion = new javax.swing.JLabel();

        PnlSeleccionarRestaurante.setBackground(new java.awt.Color(51, 153, 255));
        PnlSeleccionarRestaurante.setMinimumSize(new java.awt.Dimension(6, 6));
        PnlSeleccionarRestaurante.setName("PnlSeleccionarRestaurante"); // NOI18N

        LblAplicacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        LblAplicacion.setText("Aplicación Software Food");

        BtnAtras.setText("Atrás");
        BtnAtras.setName("BtnAtras"); // NOI18N
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        LblSelecione.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblSelecione.setText("Seleccionar Restaurante:  ");
        LblSelecione.setName("LblSelecione"); // NOI18N

        BtnSelecRest.setBackground(new java.awt.Color(51, 153, 255));
        BtnSelecRest.setText("Seleccionar Restaurante");
        BtnSelecRest.setName("BtnSelecRest"); // NOI18N
        BtnSelecRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelecRestActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Restaurante: ");

        jtxtIDRestaurante.setName("jtxtIDRestaurante"); // NOI18N

        lblMensAplicacion.setText("Software Food");

        javax.swing.GroupLayout PnlSeleccionarRestauranteLayout = new javax.swing.GroupLayout(PnlSeleccionarRestaurante);
        PnlSeleccionarRestaurante.setLayout(PnlSeleccionarRestauranteLayout);
        PnlSeleccionarRestauranteLayout.setHorizontalGroup(
            PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSeleccionarRestauranteLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtxtIDRestaurante, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSelecRest, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSeleccionarRestauranteLayout.createSequentialGroup()
                .addGroup(PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlSeleccionarRestauranteLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblImgPrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblSelecione)
                            .addComponent(LblAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(PnlSeleccionarRestauranteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMensAplicacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(BtnAtras)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSeleccionarRestauranteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscarRestaurante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnlSeleccionarRestauranteLayout.setVerticalGroup(
            PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSeleccionarRestauranteLayout.createSequentialGroup()
                .addGroup(PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlSeleccionarRestauranteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnAtras))
                    .addGroup(PnlSeleccionarRestauranteLayout.createSequentialGroup()
                        .addComponent(lblMensAplicacion)
                        .addGap(18, 18, 18)
                        .addGroup(PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImgPrincipal))))
                .addGap(30, 30, 30)
                .addComponent(LblSelecione)
                .addGap(32, 32, 32)
                .addGroup(PnlSeleccionarRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSelecRest)
                    .addComponent(jLabel1)
                    .addComponent(jtxtIDRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(buscarRestaurante, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );

        getContentPane().add(PnlSeleccionarRestaurante, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSelecRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelecRestActionPerformed
        try {
            this.buscarAlmuerzoEjeDia();
        } catch (Exception ex) {
            Logger.getLogger(GUIListarComponentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnSelecRestActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        setVisible(false);
        GUIListarRestaurantes ins = new GUIListarRestaurantes();
        ins.setVisible(true); 
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void buscarAlmuerzoEjeDia() {
        
        String nomRest = jtxtIDRestaurante.getText();
        
        try {
            listRestaurants = servicioRestaurante.listarRestaurants();
            
            if (listRestaurants.size() > 0) {
                for (Iterator<Restaurant> iterator = listRestaurants.iterator(); iterator.hasNext();) {
                    Restaurant next = iterator.next();
                    if (String.valueOf(next.getNombre()).equals(nomRest)) {
                        this.restaurante = next;
                    }
                }
            }
            
            List<PlatoEjecutivo> listPlatos = servicioRestaurante.listarAlmuerzoEjeDia();
            
            if (listPlatos.size() > 0) {
                for (Iterator<PlatoEjecutivo> iterator = listPlatos.iterator(); iterator.hasNext();) {
                    
                    PlatoEjecutivo next = iterator.next();
                    if (restaurante.getNit() == next.getResNIT()) {
                        this.plato = next;
                    }
                }
            }
            
            Component compEntrada = plato.getEntrada();
            Component compPrincipio = plato.getPrincipio();
            Component compProteina = plato.getProteina();
            Component compBebida = plato.getBebida();
            
            List<Component> componentes = servicioRestaurante.listarComponents();          
            if (componentes.size() > 0) {
                modelBuscarRestaurantes.removeAllElements();
                modelBuscarRestaurantes.addElement(restaurante.getNombre());
                for (Iterator<Component> iterator = componentes.iterator(); iterator.hasNext();) {
                    Component next = iterator.next();
                    if (compEntrada.getCompID().equals(next.getCompID()) || compPrincipio.getCompID().equals(next.getCompID()) || compProteina.getCompID().equals(next.getCompID()) || compBebida.getCompID().equals(next.getCompID())) {                            
                         modelBuscarRestaurantes.addElement("ID: " + next.getCompID()+ " Nombre: " + next.getCompNombre()+ " Tipo: " + String.valueOf(next.getCompTipo()));                            
                    }
                }              
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se Encontro el Restaurante");
        }
    }
    
    
    private void showImage() {
        
        ImageIcon imagen = new ImageIcon("imagen_softwareFood.jpeg");
        lblImgPrincipal.setBounds(10, 15, 80, 80);
        lblImgPrincipal.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(80, 80,Image.SCALE_SMOOTH)));
        PnlSeleccionarRestaurante.add(lblImgPrincipal);
        
    }
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
                final GUISeleccionarRestaurante frame = new GUISeleccionarRestaurante();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                //new GUISeleccionarRestaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnSelecRest;
    private javax.swing.JLabel LblAplicacion;
    private javax.swing.JLabel LblSelecione;
    private javax.swing.JPanel PnlSeleccionarRestaurante;
    private javax.swing.JList<String> buscarRestaurante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jtxtIDRestaurante;
    private javax.swing.JLabel lblImgPrincipal;
    private javax.swing.JLabel lblMensAplicacion;
    // End of variables declaration//GEN-END:variables
}
